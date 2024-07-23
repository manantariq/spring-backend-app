package com.prada.service;

import com.prada.model.dto.BackendTestDTO;

public interface DatabaseService {

    BackendTestDTO getUserByName(String name);
}
