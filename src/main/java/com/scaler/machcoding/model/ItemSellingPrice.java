package com.scaler.machcoding.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ItemSellingPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Item item;
    @ManyToOne
    private Shop shop;
    private Long sp;
}
