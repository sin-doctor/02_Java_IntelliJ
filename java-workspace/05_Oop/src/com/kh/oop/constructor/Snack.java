package com.kh.oop.constructor;

public class Snack {

    /*
    * SnackRun 에
    * sr1 sr2 sr3
    * 1. 기본생성자
    * 초코칩 쿠키 1500원 달콤한 초코맛
    * 허니버터칩 2000원 달콤한 버터맛
    *
    * 2. 매개변수 ALL 생성자
    * 새우깡   1200원 짤잘한 새우맛
    *
    * 과자 정보 toString 출력
    *
    * */
    private String name;
    private int price;
    private String taste;

    public Snack() {
    }

    public Snack(String name, int price, String taste) {
        this.name = name;
        this.price = price;
        this.taste = taste;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getTaste() {
        return taste;
    }

    public String toString() {
        return "snack [name=" + name + ", price=" + price + "원, taste=" + taste + "]";
    }
}
