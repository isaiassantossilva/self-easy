package com.codedevs.core.ports.driver;

import com.codedevs.core.domain.User;

public interface CreateNewUserPort {
    User execute(User user);
}
