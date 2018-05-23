package com.vend.halaatupdate.halaatupdtae.Service;

import com.vend.halaatupdate.halaatupdtae.Commons.Constants;
import com.vend.halaatupdate.halaatupdtae.Converters.ResponseConverters;
import com.vend.halaatupdate.halaatupdtae.Converters.UpdateModelConvertor;
import com.vend.halaatupdate.halaatupdtae.DTO.ResponseDTO;
import com.vend.halaatupdate.halaatupdtae.DTO.UpdateDTO;
import com.vend.halaatupdate.halaatupdtae.Entity.UpdateModel;
import com.vend.halaatupdate.halaatupdtae.Repository.UpdateRepository;
import com.vend.halaatupdate.halaatupdtae.Repository.UserRepository;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class UpdatesService {

    private UpdateRepository updateRepository;

    @Autowired
    public UpdatesService( UpdateRepository updateRepository) {
        this.updateRepository = updateRepository;
    }

    public ResponseDTO postUpdates(UpdateDTO updateDTO){
        UpdateModel updateModel = UpdateModelConvertor.toUpdateModel(updateDTO);
        return (updateRepository.save(updateModel) != null) ? ResponseConverters.toResponseDTO(Constants.SUCCESS_MESSAGE , Constants.SUCCESS_CODE ,"Your update post successfully") : ResponseConverters.toResponseDTO(Constants.FAILURE_MESSAGE , Constants.FAILURE_CODE ,"Update not posted. Please try again");
    }

    public ResponseDTO getAllUpdates(){
        List<UpdateModel> list =   UpdateModelConvertor.toUpdateList(updateRepository.findAll());
        Collections.reverse(list);
        return ResponseConverters.toResponseDTO(Constants.SUCCESS_MESSAGE , Constants.SUCCESS_CODE , list);
    }
}
