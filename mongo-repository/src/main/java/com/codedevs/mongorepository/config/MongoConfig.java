package com.codedevs.mongorepository.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {

    private static final String DB_URI = "";

    @Bean
    public MongoClient mongoClients(){
        return MongoClients.create(DB_URI);
    }

    @Bean
    public MongoTemplate mongoTemplate(){
        return new MongoTemplate(mongoClients(),"self-easy");
    }
}
