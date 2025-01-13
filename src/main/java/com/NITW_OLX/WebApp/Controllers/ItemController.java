package com.NITW_OLX.WebApp.Controllers;

import com.NITW_OLX.WebApp.Models.Item;
import com.NITW_OLX.WebApp.Repositories.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    public ItemRepository itemRepository;

    @PostMapping
    public Item createItem(@RequestBody Item item){
        return itemRepository.save(item);
    }
}
