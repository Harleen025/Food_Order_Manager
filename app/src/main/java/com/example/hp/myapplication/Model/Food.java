package com.example.hp.myapplication.Model;

public class Food {
    private String Name, Image,Description,Price,Discount,MenuId;

    public Food(){

    }
// Getting Foods Details
    public Food(String name, String image, String description, String price, String discount, String menuId){
        Name = name;
        Image = image;
        Description = description;
        Price = price;
        Discount = discount;
        MenuId = menuId;
    }
//Get name
    public String getName() {
        return Name;
    }
// Set name
    public void setName(String name) {
        Name = name;
    }
// Get Image
    public String getImage() {
        return Image;
    }
//Set Image
    public void setImage(String image) {
        Image = image;
    }
// Get Description
    public String getDescription() {
        return Description;
    }
//Set Description NEW
    public void setDescription(String description) {
        Description = description;
    }
//Get Price
    public String getPrice() {
        return Price;
    }
//Set Price
    public void setPrice(String price) {
        Price = price;
    }
// Get Discount
    public String getDiscount() {
        return Discount;
    }
//Set Discount
    public void setDiscount(String discount) {
        Discount = discount;
    }
// Get Menu ID
    public String getMenuId() {
        return MenuId;
    }
//Set Menu Id
    public void setMenuId(String menuId) {
        MenuId = menuId;
    }
}
