package com.digital.crud.saladereuniao.saladereuniao.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{
    private static final long serialVersion=1L;

    public ResourceNotFoundException(String message){
        super(message);
    }
}
