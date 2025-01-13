package com.NITW_OLX.WebApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.NITW_OLX.WebApp.Models.User;
import com.NITW_OLX.WebApp.Repositories.UserRepository;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;
    
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
