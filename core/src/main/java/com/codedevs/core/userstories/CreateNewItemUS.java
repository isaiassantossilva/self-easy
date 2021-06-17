package com.codedevs.core.userstories;

import javax.inject.Inject;
import javax.inject.Named;

import com.codedevs.core.domain.Item;
import com.codedevs.core.ports.driven.ItemRepositoryPort;
import com.codedevs.core.ports.driver.CreateNewItemPort;

@Named
public class CreateNewItemUS implements CreateNewItemPort {

    private final ItemRepositoryPort itemRepositoryPort;

    @Inject
    public CreateNewItemUS(ItemRepositoryPort itemRepositoryPort) {
        this.itemRepositoryPort = itemRepositoryPort;
    }

    @Override
    public Item execute(Item item) {
        return itemRepositoryPort.save(item);
    }
}
