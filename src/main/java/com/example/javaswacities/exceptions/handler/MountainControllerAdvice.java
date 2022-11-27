package com.example.javaswacities.exceptions.handler;

import com.example.javaswacities.exceptions.MountainAlreadyExistsException;
import com.example.javaswacities.exceptions.MountainNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MountainControllerAdvice {
    @ResponseBody
    @ExceptionHandler(MountainNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String mountainNotFoundHandler(MountainNotFoundException ex) {
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(MountainAlreadyExistsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String mountainAlreadyExists(MountainAlreadyExistsException ex){return ex.getMessage();}
}
