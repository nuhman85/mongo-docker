package com.nuhman.mongo.controller;

import com.nuhman.mongo.domain.GroceryItem;
import com.nuhman.mongo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping(path = "/item")
    public GroceryItem addNewGroceryItem(@RequestBody GroceryItem groceryItem){
        return itemService.addGroceryItem(groceryItem);
    }

}
