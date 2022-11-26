package com.example.javaswacities.controller;

import com.example.javaswacities.model.Mountain;
import com.example.javaswacities.repositories.MountainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MountainController {
    private final MountainRepository mountainRepository;

    public MountainController(MountainRepository mountainRepository) {
        this.mountainRepository = mountainRepository;
    }

    @GetMapping(path="mountain")
    public List<Mountain> get(){
        return mountainRepository.findAll();
    }
}
