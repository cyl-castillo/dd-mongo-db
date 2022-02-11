package com.dondex.ddmongodb.repositories;

import com.dondex.ddmongodb.entities.Business;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BusinessRepository extends MongoRepository<Business, String> {

    Business findBusinessByName(String name);

}
