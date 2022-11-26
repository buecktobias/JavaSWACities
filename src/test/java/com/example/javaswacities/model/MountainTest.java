package com.example.javaswacities.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainTest {
    @Test
    public void testCreateMountain(){
        final var mountain = new Mountain("Berg", "Alpen", 120.2f, "m", "34", "9");
        assertEquals(mountain.getName(), "Berg");
    }
}