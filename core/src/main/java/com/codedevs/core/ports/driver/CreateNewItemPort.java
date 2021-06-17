package com.codedevs.core.ports.driver;

import com.codedevs.core.domain.Item;
import com.codedevs.core.domain.User;

public interface CreateNewItemPort {
    Item execute(Item item);
}
