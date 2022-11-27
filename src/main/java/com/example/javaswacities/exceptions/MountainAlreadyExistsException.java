package com.example.javaswacities.exceptions;

public class MountainAlreadyExistsException extends RuntimeException {
    public MountainAlreadyExistsException(String mountainName){
        super(mountainName);
    }
}
