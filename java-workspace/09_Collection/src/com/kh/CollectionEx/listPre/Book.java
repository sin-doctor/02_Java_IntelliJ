package com.kh.CollectionEx.listPre;

public class Book {
    private String title;
    private String author;
    private int category;
    private int price;

    public Book() {
    }

    public Book(String title, String author, int category, int price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "("+title+"/"+author+"/"+category+"/"+price+")";
    }
}
