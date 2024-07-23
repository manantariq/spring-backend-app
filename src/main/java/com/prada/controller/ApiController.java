package com.prada.controller;

import com.prada.model.dto.BackendTestDTO;
import com.prada.service.DatabaseService;
import com.prada.service.impl.DatabaseServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private final DatabaseService databaseService;

    public ApiController(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    @GetMapping("/user/{name}")
    public BackendTestDTO getUserByName(@PathVariable String name) {
        return databaseService.getUserByName(name);
    }
}
