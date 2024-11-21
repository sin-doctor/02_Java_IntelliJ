package com.kh.oop.methodPre;

public class ReturnRun2 {
    public static void main(String[] args) {
        ReturnPre2 r2 = new ReturnPre2();
        System.out.println(r2.name("홍길동",40));
        System.out.println(r2.LargeNum(123,456));
        System.out.println(r2.Score(85));
        System.out.println(r2.Price(100000,20));
        System.out.println(r2.Age(17));
        System.out.println(r2.text("Hello","World"));
        System.out.println(r2.fruits("apple","banana","cherry"));
    }

}
