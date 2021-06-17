package com.codedevs.mongorepository;

import com.codedevs.core.domain.User;
import com.codedevs.core.ports.driven.UserRepositoryPort;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class UserRepositoryAdapter implements UserRepositoryPort {

    private final MongoTemplate mongoTemplate;

    @Inject
    public UserRepositoryAdapter(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public User save(User user) {
        return mongoTemplate.save(user);
    }

    @Override
    public List<User> findAll() {
        return mongoTemplate.findAll(User.class);
    }
}
