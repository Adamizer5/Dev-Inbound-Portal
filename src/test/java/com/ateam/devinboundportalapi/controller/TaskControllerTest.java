package com.ateam.devinboundportalapi.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskControllerTest {

    @Test
    public void testGetTaskById() {
        TaskController taskController = new TaskController();
        String result = taskController.getTaskById(1);
        Assertions.assertEquals("success1", result);
    }
}
