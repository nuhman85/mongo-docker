package com.nuhman.mongo.controller;

import com.nuhman.mongo.domain.GroceryItem;
import com.nuhman.mongo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping(path = "/item")
    public GroceryItem addNewGroceryItem(@RequestBody GroceryItem groceryItem){
        return itemService.addGroceryItem(groceryItem);
    }

    @GetMapping(path = "/items")
    public List<GroceryItem> getAllItems(){
        return itemService.getAllGroceryItem();
    }
    @GetMapping(path = "/items/{category}")
    public List<GroceryItem> getAllItemsByCategory(@PathVariable String category){
        return itemService.getAllGroceryItemByCategoryName(category);
    }

}
