package com.example.demo.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantInventoryEntryRepository extends JpaRepository<PlantInventoryEntry, Long> {}
