package com.scaler.machcoding.controller;

import com.scaler.machcoding.model.Shop;
import com.scaler.machcoding.service.ShopService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    ShopService shopService;

//    API to return list of available shops with their metadata
    @GetMapping("/")
    public List<List<String>> getShops(){
        return shopService.getShops();
    }

//    API to return the menu and items availability of a particular shop
    @GetMapping("/:shopId/menu")
    public String getShopMenu(@PathParam("shopId") Integer shopId){
        return shopService.getShopMenu(shopId);
    }
}
