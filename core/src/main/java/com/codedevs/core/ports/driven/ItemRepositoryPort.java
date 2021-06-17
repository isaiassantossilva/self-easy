package com.codedevs.core.ports.driven;

import com.codedevs.core.domain.Item;
import com.codedevs.core.domain.User;

import java.util.List;

public interface ItemRepositoryPort {
    Item save(Item item);
    List<Item> findAll();
}
