package com.example.javaswacities.exceptions;

public class MountainNotFoundException extends RuntimeException{
    public MountainNotFoundException(String searchedName){
        super("No Mountain with name: " + searchedName);
    }
}
