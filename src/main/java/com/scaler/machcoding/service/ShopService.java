package com.scaler.machcoding.service;


import com.scaler.machcoding.model.Shop;
import com.scaler.machcoding.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ShopService {
    @Autowired
    ShopRepository shopRepository;
    public List<List<String>> getShops() {
        return shopRepository.findAll().stream().map(s -> {
            List<String> name_metadata = new ArrayList<>();
            name_metadata.add(s.getName());
            name_metadata.add(s.getMetadata());
            return name_metadata;
        }).collect(Collectors.toList());
    }

    public String getShopMenu(Integer shopId) {
        return "";
///*
//        {
//          item_name, max_qty, selling_price, mrp
//
//        }*/
//        Optional<Shop> optionalShop = shopRepository.findById(shopId);
//        Shop shop = optionalShop.get();
//        shop.getMenu().getItems().stream().map(item -> {
//            String name = item.getName();
//            Integer maxQty = shop.getInventories().get(item.getId()).getQuantity();
////            Integer sp = shop.getInventories().get(item.getId());
//
//        })
//
    }
}
