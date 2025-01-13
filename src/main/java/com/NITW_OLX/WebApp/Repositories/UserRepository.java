package com.NITW_OLX.WebApp.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.NITW_OLX.WebApp.Models.User;

public interface UserRepository extends MongoRepository<User,String> {

}
