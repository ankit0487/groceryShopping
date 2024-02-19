package com.scaler.machcoding.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Long price;
    @OneToMany
    private List<ItemSellingPrice> itemSellingPrices;
}
