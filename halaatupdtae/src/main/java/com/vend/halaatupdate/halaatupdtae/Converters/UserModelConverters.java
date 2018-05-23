package com.vend.halaatupdate.halaatupdtae.Converters;

import com.vend.halaatupdate.halaatupdtae.DTO.UserDTO;
import com.vend.halaatupdate.halaatupdtae.Entity.UserModel;

public class UserModelConverters {

    public static  UserModel toUserModel(UserDTO userDTO){
        return new UserModel(userDTO.getName() , userDTO.getPassword() , userDTO.getEmail() , userDTO.getOccupation());
    }

    public static  UserDTO toUserDTO(UserModel userModel){
        return new UserDTO(userModel.getName() , userModel.getEmail() , userModel.getPassword() , userModel.getOccupation());
    }


}
