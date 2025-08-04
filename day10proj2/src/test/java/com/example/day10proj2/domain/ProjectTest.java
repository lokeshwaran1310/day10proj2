package com.example.day10proj2.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {

    @Test
    void testSetAndGetName() {
        Project project = new Project();
        project.setName("Test Project");
        assertEquals("Test Project", project.getName());
    }
}
