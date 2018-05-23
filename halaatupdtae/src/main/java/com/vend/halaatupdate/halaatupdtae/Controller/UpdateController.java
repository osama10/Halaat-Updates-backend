package com.vend.halaatupdate.halaatupdtae.Controller;

import com.vend.halaatupdate.halaatupdtae.DTO.ResponseDTO;
import com.vend.halaatupdate.halaatupdtae.DTO.UpdateDTO;
import com.vend.halaatupdate.halaatupdtae.DTO.UserDTO;
import com.vend.halaatupdate.halaatupdtae.Service.UpdatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/halaatupdates")
public class UpdateController {

    @Autowired
    private UpdatesService updatesService;

    @RequestMapping(method= RequestMethod.POST , value = "/postupdate" , consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    ResponseDTO postUpdate(@RequestBody @Validated UpdateDTO updateDTO){
            return updatesService.postUpdates(updateDTO);
    }

    @RequestMapping(method= RequestMethod.GET , value = "/getallupdates" , consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    ResponseDTO getAllUpdates(){
        return updatesService.getAllUpdates();
    }


}
