package com.example.javaswacities.controller;

import com.example.javaswacities.model.Mountain;
import com.example.javaswacities.repositories.MountainRepository;
import com.example.javaswacities.services.MountainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class MountainController {
    private final MountainService mountainService;

    public MountainController(MountainService mountainService) {
        this.mountainService = mountainService;
    }

    @GetMapping(path="mountain")
    public Collection<Mountain> get(){
        return mountainService.findAllMountains();
    }
}
