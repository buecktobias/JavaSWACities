package com.example.javaswacities.repositories;

import com.example.javaswacities.model.Mountain;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class MountainRepositoryTest {
    @Autowired
    private MountainRepository mountainRepository;

    @BeforeEach
    void setUp() {

    }

    @Test
    public void testFindAll() {
        final var mountain = new Mountain("Berg1", "Bergkette", 120.3, "mountain", 12.7, 18.3);
        final var mountain1 = new Mountain("Berg2", "Bergkette", 101.1,"mountain", 12.1, 8.3);
        mountainRepository.save(mountain);
        mountainRepository.save(mountain1);
        final var mountainList = mountainRepository.findAll();
        assertEquals("Berg2", mountainList.get(1).getName());
    }
}