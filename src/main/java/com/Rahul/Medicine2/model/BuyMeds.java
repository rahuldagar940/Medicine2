package com.Rahul.Medicine2.model;

public class BuyMeds {
    public int id;
    public String name;
    public String picURL;
    public int price;

    public BuyMeds(int id, String name, String picURL, int price) {
        this.id = id;
        this.name = name;
        this.picURL = picURL;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicURL() {
        return picURL;
    }

    public void setPicURL(String picURL) {
        this.picURL = picURL;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
