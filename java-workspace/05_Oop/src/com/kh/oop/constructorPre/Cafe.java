package com.kh.oop.constructorPre;

public class Cafe {
// 필드
    private String name;
    private int price;
    private int quantity;
    // 메뉴이름
    // 가격
    // 주문 수량

 // 메서드

    public Cafe() {
    }

    public Cafe(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public int getTotalPrice() {
        int totalprice = price * quantity;
        return totalprice;
    }
    @Override
    public String toString() {
        return "Cafe [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }

    // 1. 기본생성자
    // 2. 필수생성자
    // 3. Setter
    // 4. Getter
    // 5. 주문 총액 계산 price * quantity 전달
    // 6. 주문 출력 toString @Override 사용해서 출력
}
