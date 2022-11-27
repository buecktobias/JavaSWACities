package com.example.javaswacities.services;

import com.example.javaswacities.helper.MountainNameChecker;
import com.example.javaswacities.model.Mountain;
import com.example.javaswacities.repositories.MountainRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MountainService {
    private final MountainRepository mountainRepository;
    private final MountainNameChecker mountainNameChecker;

    public MountainService(MountainRepository mountainRepository, MountainNameChecker mountainNameChecker) {
        this.mountainRepository = mountainRepository;
        this.mountainNameChecker = mountainNameChecker;
    }

    public Collection<Mountain> findAllMountains() {
        return mountainRepository.findAll();
    }

    public Optional<Mountain> findMountainByName(String name) {
        return mountainRepository.findAll().stream().filter(mountain -> Objects.equals(mountain.getName(), name)).findFirst();
    }

    public Collection<Mountain> searchMountainsByName(String name) {
        return mountainRepository.findAll().stream().filter(
                mountain -> mountainNameChecker.mountainNameContainsCaseInsensitive(mountain, name)
                ).collect(Collectors.toList());
    }
}
