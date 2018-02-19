package com.example.demo.demo;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class PlantInventoryEntry {
    @Id
    @Generated
    Long id;

    String name;
    String description;
    @Column(precision=8, scale=2)
    BigDecimal price;
}
