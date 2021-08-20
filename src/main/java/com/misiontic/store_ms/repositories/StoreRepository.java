package com.misiontic.store_ms.repositories;

import com.misiontic.store_ms.models.Store;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreRepository extends MongoRepository <Store, String> {
}
