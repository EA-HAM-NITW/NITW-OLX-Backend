package com.NITW_OLX.WebApp.Models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "Users")
public class User {
    @JsonProperty("uid")
    @Id
    private String uid;
    @JsonProperty("displayName")
    private String name;
    @JsonProperty("email")
    private String mail;
    
    private String phone;
    @JsonProperty("photoURL")
    private String photoUrl;
    //array for listed items
    private List<String> items; 
    //array for reviews
    //array for items bought

    // Getter for UID
    public String getUid() {
        return uid;
    }

    // Setter for UID
    public void setUid(String uid) {
        this.uid = uid;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Mail
    public String getMail() {
        return mail;
    }

    // Setter for Mail
    public void setMail(String mail) {
        this.mail = mail;
    }

    // Getter for Phone
    public String getPhone() {
        return phone;
    }

    // Setter for Phone
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Getter for Photo URL
    public String getPhotoUrl() {
        return photoUrl;
    }

    // Setter for Photo URL
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    //Getter for items
    public List<String> getItems(){
        return items;
    }

    //Setter for items
    public void setItems(String item){
        if (items == null) {
            items = new ArrayList<>();
        }
        items.add(item);
    }
}
