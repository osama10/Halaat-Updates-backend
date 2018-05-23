package com.vend.halaatupdate.halaatupdtae.Converters;

import com.vend.halaatupdate.halaatupdtae.DTO.UpdateDTO;
import com.vend.halaatupdate.halaatupdtae.Entity.UpdateModel;

import java.util.ArrayList;
import java.util.List;

public class UpdateModelConvertor {

  public static UpdateModel toUpdateModel(UpdateDTO updateDTO){
        return  new UpdateModel(updateDTO.getTitle() , updateDTO.getDescription() , updateDTO.getImage() , updateDTO.getDate() , updateDTO.getUserId());
    }

    public static  UpdateDTO toUpdateDTO(UpdateModel updateModel){
        return  new UpdateDTO(updateModel.getTitle() , updateModel.getDescription() , updateModel.getImage() , updateModel.getDate() , updateModel.getUser_id());
    }

    public  static List<UpdateModel>toUpdateList(Iterable<UpdateModel> iterable){
        List<UpdateModel>list = new ArrayList<UpdateModel>();
        iterable.iterator().forEachRemaining(list::add);
        return  list;
    }
}
