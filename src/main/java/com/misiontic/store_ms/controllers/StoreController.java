package com.misiontic.store_ms.controllers;

import com.misiontic.store_ms.exceptions.StoreNotFoundException;
import com.misiontic.store_ms.models.Store;
import com.misiontic.store_ms.repositories.StoreRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StoreController {

    private final StoreRepository storeRepository;

    public StoreController(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;

        //Seed Stores
        Store newStore1 = new Store("001", "Mc Daniels", "Tienda de hamburguesas", "");
        Store newStore2 = new Store("002", "Star Wars Coffe", "Tienda de cafe", "");
        Store newStore3 = new Store("003", "Los Pollos Hermanos", "Tienda de pollos", "");
        Store newStore4 = new Store("004", "Sushi Yamete Kudasai", "Tienda de sushi", "");

        this.storeRepository.save(newStore1);
        this.storeRepository.save(newStore2);
        this.storeRepository.save(newStore3);
        this.storeRepository.save(newStore4);

    }

    @GetMapping("/store/{storeId}")
    Store getStore(@PathVariable String storeId){
        return storeRepository.findById(storeId)
                .orElseThrow(() -> new StoreNotFoundException("No se encontro una tienda con el storeId: " + storeId));
    }

    @GetMapping("/stores")
    List<Store> getStores(){
        return storeRepository.findAll();
    }
}
