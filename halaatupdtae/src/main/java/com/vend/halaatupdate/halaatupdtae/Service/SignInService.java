package com.vend.halaatupdate.halaatupdtae.Service;

import com.vend.halaatupdate.halaatupdtae.Commons.Constants;
import com.vend.halaatupdate.halaatupdtae.Converters.ResponseConverters;
import com.vend.halaatupdate.halaatupdtae.DTO.CredentialsDTO;
import com.vend.halaatupdate.halaatupdtae.DTO.ResponseDTO;
import com.vend.halaatupdate.halaatupdtae.Entity.UserModel;
import com.vend.halaatupdate.halaatupdtae.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignInService {

    private UserRepository userRepository;

    @Autowired
    public SignInService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    public ResponseDTO getAuthentication(CredentialsDTO credentialsDTO){
        UserModel userModel = this.userRepository.findByEmailAndPassword(credentialsDTO.getEmail() , credentialsDTO.getPassword());
        ResponseDTO responseDTO;

        if(userModel != null){
            responseDTO = ResponseConverters.toResponseDTO(Constants.SUCCESS_MESSAGE , Constants.SUCCESS_CODE , userModel);
        }else {
            responseDTO = ResponseConverters.toResponseDTO(Constants.FAILURE_MESSAGE , Constants.FAILURE_CODE , "No such user exist.");
        }

        return  responseDTO;
    }
}
