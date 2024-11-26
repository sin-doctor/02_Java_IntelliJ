package com.kh.poly.pack2.bookPre;

public class BookRun {
    public static void main(String[] args) {
        EBook eBook = new EBook("자바 프로그래밍","홍길동",20000,"15.5MB");
        System.out.println(eBook);
        PrintBook printBook = new PrintBook("파이썬 입문","이영희",18000,3000);
        System.out.println(printBook);
    }
}
