package com.example.javaswacities.controller;

import com.example.javaswacities.dto.MountainDTO;
import com.example.javaswacities.dto.TestDTO;
import com.example.javaswacities.model.Mountain;
import com.example.javaswacities.services.MountainService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

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

    @PostMapping(path="mountain", consumes = "application/json")
    public void createNewMountain(@RequestBody MountainDTO newMountain, final HttpServletRequest request) throws IOException {
        System.out.println(newMountain);

    }

    @PostMapping(path="test", consumes = "application/json")
    public void test(@RequestBody TestDTO testDTO){
        System.out.println(testDTO);

    }
}
