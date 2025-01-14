package com.NITW_OLX.WebApp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NITW_OLX.WebApp.Models.User;
import com.NITW_OLX.WebApp.Repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User saveUser(User user){
        if(userRepository.findByUid(user.getUid()) != null){
            return user;
        }
        else
            return userRepository.save(user);
    }
}
