package com.scaler.machcoding.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String metadata;

    @OneToOne
    private Menu menu;

    @OneToMany
    private List<Inventory> inventories;

    private Address address;
}




//id
//        - metadata: {}
//        - name
//        - menu  (foreign key)
//        - inventory (foreign key)
//        - address (foreign key)