package com.NITW_OLX.WebApp.Controllers;

import com.NITW_OLX.WebApp.Models.Item;
import com.NITW_OLX.WebApp.Services.ItemService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    private ItemService itemService;
    private static final Logger logger = LoggerFactory.getLogger(ItemController.class);

    @PostMapping
    public Item createItem(@RequestBody Item item){
        logger.info("Received Item: {}", item);
        Item newItem = itemService.saveItem(item);
        itemService.addItemToUser(newItem);
        return newItem;
    }
}
