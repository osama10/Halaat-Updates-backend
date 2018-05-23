package com.vend.halaatupdate.halaatupdtae.Controller;
import com.vend.halaatupdate.halaatupdtae.Commons.Constants;
import com.vend.halaatupdate.halaatupdtae.DTO.CredentialsDTO;
import com.vend.halaatupdate.halaatupdtae.DTO.ResponseDTO;
import com.vend.halaatupdate.halaatupdtae.DTO.UserDTO;
import com.vend.halaatupdate.halaatupdtae.Service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/halaatupdates")
public class SignInController {

    @Autowired
    private SignInService signInService;

    @RequestMapping(method=RequestMethod.POST , value = "/signin" , consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO signin(@RequestBody @Validated CredentialsDTO credentialsDTO){

        return  signInService.getAuthentication(credentialsDTO);
    }



}
