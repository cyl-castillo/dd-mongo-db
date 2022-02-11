package com.dondex.ddmongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class DdMongoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DdMongoDbApplication.class, args);
    }

}
