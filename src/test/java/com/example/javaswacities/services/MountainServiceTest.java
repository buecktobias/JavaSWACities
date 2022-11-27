package com.example.javaswacities.services;

import com.example.javaswacities.model.Mountain;
import com.example.javaswacities.repositories.MountainRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MountainServiceTest {
    @Mock
    private MountainRepository mountainRepository;
    @Autowired
    @InjectMocks
    private MountainService mountainService;
    private Mountain mountain1;
    private Mountain mountain2;
    List<Mountain> mountainList;
    @BeforeEach
    public void setUp() {
        mountainList = new ArrayList<>();
        mountain1 = new Mountain("Berg1", "Bergkette", 120.3, "mountain", 12.7, 18.3);
        mountain2 = new Mountain("Berg2", "Bergkette", 101.1,"mountain", 12.1, 8.3);

        mountainList.add(mountain1);
        mountainList.add(mountain2);
    }

    @Test
    void testFindAll() {
        mountainRepository.save(mountain1);
        when(mountainRepository.findAll()).thenReturn(mountainList);
        final var mountainList1 = mountainService.findAllMountains();
        assertEquals(mountainList1,mountainList);
        verify(mountainRepository,times(1)).save(mountain1);
        verify(mountainRepository,times(1)).findAll();
    }
}