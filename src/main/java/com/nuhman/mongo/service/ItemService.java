package com.nuhman.mongo.service;

import com.nuhman.mongo.domain.GroceryItem;
import com.nuhman.mongo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.GregorianCalendar;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public GroceryItem getGroceryItem(String name){
        return itemRepository.findItemByName(name);
    }

    public GroceryItem addGroceryItem(GroceryItem groceryItem){
        return itemRepository.save(groceryItem);
    }

}
