package com.example.eatit.Model;

public class Food {
    private String  Name;
    private String  Image;
    private String  Description;
    private String  Price;
    private String  Discount;
    private String  MenuId;
    private String  StrikePrice;

    public Food() {
    }

    public Food(String name, String image, String description, String price, String discount, String menuId) {
        Name = name;
        Image = image;
        Description = description;
        Price = price;
        Discount = discount;
        MenuId = menuId;
    }

    public Food(String name, String image, String description, String price, String discount, String menuId,String strikePrice) {
        Name = name;
        Image = image;
        Description = description;
        Price = price;
        Discount = discount;
        MenuId = menuId;
        StrikePrice = strikePrice;
    }

    public String getStrikePrice() {
        return StrikePrice;
    }

    public void setStrikePrice(String strikePrice) {
        StrikePrice = strikePrice;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String menuId) {
        MenuId = menuId;
    }
}