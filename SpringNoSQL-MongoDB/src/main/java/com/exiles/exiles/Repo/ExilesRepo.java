package com.exiles.exiles.Repo;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

public class ExilesRepo {
    public @Bean
    MongoTemplate mongoTemplate () {
        MongoTemplate mongoTemplate = new MongoTemplate(new MongoClient("127.0.0.1"), "Exiles");
        return mongoTemplate;
    }
}
