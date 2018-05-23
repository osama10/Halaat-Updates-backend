package com.vend.halaatupdate.halaatupdtae.Controller;


import com.vend.halaatupdate.halaatupdtae.DTO.CredentialsDTO;
import com.vend.halaatupdate.halaatupdtae.DTO.ResponseDTO;
import com.vend.halaatupdate.halaatupdtae.DTO.UserDTO;
import com.vend.halaatupdate.halaatupdtae.Service.SignInService;
import com.vend.halaatupdate.halaatupdtae.Service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/halaatupdates")
public class SignupController {

    @Autowired
    private SignUpService signUpService;

    @RequestMapping(method= RequestMethod.POST , value = "/signup" , consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO sigup(@RequestBody @Validated UserDTO userDTO){

        return  signUpService.signup(userDTO);
    }

}
