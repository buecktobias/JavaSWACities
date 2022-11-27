package com.example.javaswacities.exceptions.handler;

import com.example.javaswacities.exceptions.MountainNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MountainNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(MountainNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(MountainNotFoundException ex) {
        return ex.getMessage();
    }
}
