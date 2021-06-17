package com.codedevs.core.ports.driven;

import com.codedevs.core.domain.User;

import java.util.List;

public interface UserRepositoryPort {
    User save(User user);
    List<User> findAll();
}
