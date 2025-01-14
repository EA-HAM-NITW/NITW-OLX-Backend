package com.NITW_OLX.WebApp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NITW_OLX.WebApp.Models.Item;
import com.NITW_OLX.WebApp.Models.User;
import com.NITW_OLX.WebApp.Repositories.ItemRepository;
import com.NITW_OLX.WebApp.Repositories.UserRepository;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private UserRepository userRepository;

    public Item saveItem(Item item){
        return itemRepository.save(item);
    }

    public void addItemToUser(Item item){
        User user = userRepository.findByUid(item.getUserUid());
        if(user == null) System.out.println("User doesnt exist");
        else{
            user.setItems(item.getId());
        }
        userRepository.save(user); 
    }
}
