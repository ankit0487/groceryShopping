package com.scaler.machcoding.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String areaName;
    private String pincode;
    private String state;
    private String latitude;
    private String longitute;
    private String city;

}



//address_line1
//        - area_name
//        - pincode
//        - city
//        - state
//        - latitude
//        - longitute