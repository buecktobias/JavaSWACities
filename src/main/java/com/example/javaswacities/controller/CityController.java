package com.example.javaswacities.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController{
    @GetMapping(path="cities")
    public String get(){
        return "Cities";
    }
}
