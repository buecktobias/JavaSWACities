package com.example.javaswacities.services;

import com.example.javaswacities.model.Mountain;
import com.example.javaswacities.repositories.MountainRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

@Service
public class MountainService {
    private final MountainRepository mountainRepository;

    public MountainService(MountainRepository mountainRepository) {
        this.mountainRepository = mountainRepository;
    }

    public Collection<Mountain> findAllMountains(){
        return mountainRepository.findAll();
    }

    public Optional<Mountain> findMountainByName(String name){
        return mountainRepository.findAll().stream().filter(mountain -> Objects.equals(mountain.getName(), name)).findFirst();
    }
}
