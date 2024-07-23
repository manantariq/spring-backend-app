package com.prada.repository;

import com.prada.model.dto.BackendTestDTO;
import com.prada.model.entity.BackendTestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BackendTestRepository extends JpaRepository<BackendTestEntity, Long> {

  Optional<BackendTestDTO> findByName(String name);
}