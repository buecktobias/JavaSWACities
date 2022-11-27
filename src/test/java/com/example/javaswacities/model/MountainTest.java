package com.example.javaswacities.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainTest {
    @Test
    public void testCreateMountain(){
        final var mountain = new Mountain("Berg", "Alpen", 120.2, "m", 34.1, 9.3);
        assertEquals(mountain.getName(), "Berg");
        mountain.setName("Berg1");
        assertEquals(mountain.getName(), "Berg1");
    }
}