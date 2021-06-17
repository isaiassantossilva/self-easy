package com.codedevs.mongorepository;

import com.codedevs.core.domain.Item;
import com.codedevs.core.ports.driven.ItemRepositoryPort;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class ItemRepositoryAdapter implements ItemRepositoryPort {

    private final MongoTemplate mongoTemplate;

    @Inject
    public ItemRepositoryAdapter(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Item save(Item item) {
        return mongoTemplate.save(item);
    }

    @Override
    public List<Item> findAll() {
        return mongoTemplate.findAll(Item.class);
    }
}
