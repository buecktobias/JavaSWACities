package com.example.javaswacities.controller;

import com.example.javaswacities.model.Mountain;
import com.example.javaswacities.services.MountainService;
import org.springframework.http.MediaType;
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

    @GetMapping(path = "mountain", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Mountain> get() {
        return mountainService.findAllMountains();
    }

    @GetMapping(path = "mountain/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mountain getMountainByName(@PathVariable String name) {
        return mountainService.findMountainByName(name);
    }

    @GetMapping(path = "mountain/search/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Mountain> searchMountainByName(@PathVariable String name){
        return mountainService.searchMountainsByName(name);
    }

    @GetMapping(path="mountain/mountains/{mountains}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Mountain> searchMountainByMountains(@PathVariable String mountains){
        return mountainService.searchMountainByMountains(mountains);
    }

}
