package com.vend.halaatupdate.halaatupdtae.Service;

import com.vend.halaatupdate.halaatupdtae.Commons.Constants;
import com.vend.halaatupdate.halaatupdtae.Converters.ResponseConverters;
import com.vend.halaatupdate.halaatupdtae.Converters.UserModelConverters;
import com.vend.halaatupdate.halaatupdtae.DTO.ResponseDTO;
import com.vend.halaatupdate.halaatupdtae.DTO.UserDTO;
import com.vend.halaatupdate.halaatupdtae.Entity.UserModel;
import com.vend.halaatupdate.halaatupdtae.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {

    private UserRepository userRepository;

    @Autowired
    public SignUpService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseDTO signup(UserDTO userDTO){

        ResponseDTO responseDTO;
        UserModel userModel = userRepository.findByEmail(userDTO.getEmail());

        if(userModel == null) {
           UserModel newUser =  userRepository.save(UserModelConverters.toUserModel(userDTO));

            responseDTO =  (newUser != null) ? ResponseConverters.toResponseDTO(Constants.SUCCESS_MESSAGE , Constants.SUCCESS_CODE , "SignUp Successful") :
                     ResponseConverters.toResponseDTO(Constants.FAILURE_MESSAGE , Constants.FAILURE_CODE , "Signup Failed . Something unexpected happen. Please try later.");
        }else {
            responseDTO = ResponseConverters.toResponseDTO(Constants.FAILURE_MESSAGE , Constants.FAILURE_CODE , "Signup Failed . User already exist.");

        }

        return  responseDTO;
    }
}
