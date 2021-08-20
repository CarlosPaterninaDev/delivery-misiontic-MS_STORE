package com.misiontic.store_ms.models;

import org.springframework.data.annotation.Id;


public class Store {
    @Id
    private String storeId;
    private String storeName;
    private String description;
    private String img;

    public Store(String storeId, String storeName, String description, String img) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.description = description;
        this.img = img;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}