package com.example.controller;

import com.example.model.Item;
import com.example.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class CrudController {

    @Autowired
    private CrudService crudService;

    @PostMapping
    public ResponseEntity<Item> createItem(@RequestBody Item item) {
        Item createdItem = crudService.addItem(item);
        return ResponseEntity.status(201).body(createdItem);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItem(@PathVariable int id) {
        return crudService.findItemById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable int id, @RequestBody Item item) {
        return crudService.updateItem(id, item)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable int id) {
        boolean isDeleted = crudService.deleteItem(id);
        return isDeleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Item>> getAllItems() {
        List<Item> items = crudService.findAllItems();
        return ResponseEntity.ok(items);
    }
}