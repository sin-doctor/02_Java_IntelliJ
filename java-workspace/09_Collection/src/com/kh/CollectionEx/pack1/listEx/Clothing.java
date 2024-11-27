package com.kh.CollectionEx.pack1.listEx;

public class Clothing {
    private String name;
    private String category;
    private String price;

    public Clothing() {
    }

    public Clothing(String name, String category, String price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "옷이름 :" + name + "카테고리 (상의/하의/외투 등) :" + category + "가격 : " + price +"원";
    }
}
