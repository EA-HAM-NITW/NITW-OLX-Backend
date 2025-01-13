package com.NITW_OLX.WebApp.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Items")
public class Item {

    @Id
    private int id;
    private String title;
    private String desc;
    private String category;
    private int price;
    private Boolean isAvailableForRent;
    private int pricePerDay;
    //an object for seller
    private String status;
    private String roomNumber;
    private String Hostel;
    private String location;
    //an array of objects for reviews

    // Getters for the fields

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public Boolean getIsAvailableForRent() {
        return isAvailableForRent;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public String getStatus() {
        return status;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getHostel() {
        return Hostel;
    }

    public String getLocation() {
        return location;
    }
}

