package com.kh.dto;

public class 과자 {
    private String name; //과자 이름
    private int price; // 과자 가격
    private String flavor; // 과자 맛

    // 기본 생성자

    public 과자() {
    }

    // 필수 생성자

    public 과자(String name, int price, String flavor) {
        this.name = name;
        this.price = price;
        this.flavor = flavor;
    }

    //Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    //Getter

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getFlavor() {
        return flavor;
    }

    //저장된 과자 정보를 볼 수 있는 toString 재사용

    @Override
    public String toString() {
        return "과자{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", flavor='" + flavor + '\'' +
                '}';
    }
}
