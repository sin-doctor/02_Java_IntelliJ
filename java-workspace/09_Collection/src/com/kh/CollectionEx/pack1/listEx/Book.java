package com.kh.CollectionEx.pack1.listEx;

public class Book {
    private String title;
    private String author;
    private String category;
    private int price;

    public Book() {
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "도서명 : "+title+ "\n저자명 : "+author+"\n : (1.인문 / 2.자연과학 / 3.의료 / 4.기타) : " + category+"\n 가격 : "+price;

    }
}

