package com.prada.service.impl;

import com.prada.model.dto.BackendTestDTO;
import com.prada.repository.BackendTestRepository;
import com.prada.service.DatabaseService;
import org.springframework.stereotype.Service;

@Service
public class DatabaseServiceImpl implements DatabaseService {

    private final BackendTestRepository backendTestRepo;

    public DatabaseServiceImpl(BackendTestRepository backendTestRepo) {
        this.backendTestRepo = backendTestRepo;
    }

    @Override
    public BackendTestDTO getUserByName(String name) {
        return backendTestRepo.findByName(name).orElseThrow();
    }
}
