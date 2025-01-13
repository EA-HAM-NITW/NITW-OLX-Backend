package com.NITW_OLX.WebApp.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.NITW_OLX.WebApp.Models.Item;

@Repository

public interface ItemRepository extends MongoRepository<Item, String> {

}
