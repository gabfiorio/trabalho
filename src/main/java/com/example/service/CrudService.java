package com.example.service;

import com.example.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CrudService {

    private final List<Item> items = new ArrayList<>();
    private int currentId = 1;

    public Item addItem(Item item) {
       item.setId((long) currentId++);
        items.add(item);
        return item;
    }

    public Optional<Item> findItemById(int id) {
        return items.stream().filter(item -> item.getId() == id).findFirst();
    }

    public List<Item> findAllItems() {
        return new ArrayList<>(items);
    }

    public Optional<Item> updateItem(int id, Item updatedItem) {
        return findItemById(id).map(item -> {
            item.setName(updatedItem.getName());
            item.setDescription(updatedItem.getDescription());
            return item;
        });
    }

    public boolean deleteItem(int id) {
        return items.removeIf(item -> item.getId() == id);
    }
}