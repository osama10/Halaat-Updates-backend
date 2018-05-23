package com.vend.halaatupdate.halaatupdtae.Converters;

import com.vend.halaatupdate.halaatupdtae.Commons.Constants;
import com.vend.halaatupdate.halaatupdtae.DTO.ResponseDTO;

import java.util.HashMap;
import java.util.Map;

public class ResponseConverters {

    public  static ResponseDTO toResponseDTO(String description , int statusCode , Object data) {
        ResponseDTO responseDTO = new ResponseDTO();

        Map _data = new HashMap();
        _data.put(Constants.DATA ,data);

        responseDTO.setDescription(description);
        responseDTO.setStatusCode(statusCode);
        responseDTO.setResponseBody(_data);

        return  responseDTO;
    }
}
