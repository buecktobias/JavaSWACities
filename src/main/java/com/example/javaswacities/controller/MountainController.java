package com.example.javaswacities.controller;

import com.example.javaswacities.model.Mountain;
import com.example.javaswacities.services.MountainService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class MountainController {
    private final MountainService mountainService;

    public MountainController(MountainService mountainService) {
        this.mountainService = mountainService;
    }

    @GetMapping(path = "mountain")
    public Collection<Mountain> get() {
        return mountainService.findAllMountains();
    }

    @GetMapping(path = "mountain/{name}")
    public ResponseEntity<Mountain> getMountainByName(@PathVariable String name) {
        final var optionalMountain = mountainService.findMountainByName(name);
        return ResponseEntity.of(optionalMountain);
    }

    @GetMapping(path = "mountain/search/{name}")
    public Collection<Mountain> searchMountainByName(@PathVariable String name){
        return mountainService.searchMountainsByName(name);
    }
}
