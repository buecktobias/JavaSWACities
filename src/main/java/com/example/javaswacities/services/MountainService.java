package com.example.javaswacities.services;

import com.example.javaswacities.exceptions.MountainNotFoundException;
import com.example.javaswacities.model.Mountain;
import com.example.javaswacities.repositories.MountainRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class MountainService {
    private final MountainRepository mountainRepository;
    private final MountainNameCheckerService mountainNameCheckerService;

    public MountainService(MountainRepository mountainRepository, MountainNameCheckerService mountainNameCheckerService) {
        this.mountainRepository = mountainRepository;
        this.mountainNameCheckerService = mountainNameCheckerService;
    }

    public Collection<Mountain> findAllMountains() {
        return mountainRepository.findAll();
    }

    public Mountain findMountainByName(String name) {
        return mountainRepository.findAll().stream().filter(mountain -> Objects.equals(mountain.getName(), name))
                .findFirst()
                .orElseThrow(() -> new MountainNotFoundException(name));
    }

    public Collection<Mountain> searchMountainsByName(String name) {
        return mountainRepository.findAll().stream().filter(
                mountain -> mountainNameCheckerService.mountainNameContainsCaseInsensitive(mountain, name)
                ).collect(Collectors.toList());
    }

    public Collection<Mountain> searchMountainByMountains(String mountainsSearch){
        return mountainRepository.findAll().stream().filter(
                mountain -> {
                    final var mountains = mountain.getMountains();
                    return mountains != null && mountains.equals(mountainsSearch);
                }
        ).collect(Collectors.toList());
    }
}
