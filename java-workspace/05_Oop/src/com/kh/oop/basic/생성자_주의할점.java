package com.kh.oop.basic;

public class 생성자_주의할점 {
    // 피르

    private String a;
    private String b;
    private int c;
    private int d;
    private char e;

    //생성자
    // 1. 매개변수가 없는 기본 생성자

    public 생성자_주의할점() {
    }

    //2.매개변수가 모두 들어있는 ALL 생성자

    public 생성자_주의할점(String a, String b, int c, int d, char e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    // 3. 매개변수를 원하는 변수의 값만 가져올 수 있도록 설정
    // 생성자 안에 오는 매개변수(파라미터)의 자료형은 여러 경우의 수로 하나씩 존재
    public 생성자_주의할점(String a, String b) {
        this.a = a;
        this.b = b;
    }
    public 생성자_주의할점(int c, int d) {
       this.c = c;
       this.d = d;
    }


}