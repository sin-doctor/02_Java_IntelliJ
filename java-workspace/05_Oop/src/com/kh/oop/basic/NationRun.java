package com.kh.oop.basic;

public class NationRun {
    public static void main(String[] args) {
        /*
        * Nation(국민) 객체 생성
        * Nation 클래스의 내용대로 HEAP 영역에 할당하는 것
        * */

        // 각각의 국민들의 정보를 받고 조회할 것

        // Nation 객체를 이용해서 정보를 등록하고 등록한 내용을 출력할 것
        Nation n = new Nation();
        // 점 , 하위 접근 연산자(.) 객체 내부에 작성한 변수명/기능을 접근,호출 실행시키는 연산자
        n.name = "홍길동";
        n.age = 18;
        n.gender = 'M';
        n.introduce();      //new Nation().introduce(); NA
        n.납세의의무();      //납세의 의무가 있는 사람을 확인

        n.name = "신짱구";
        n.age = 5;
        n.gender = 'F';
        n.introduce();
        n.납세의의무();

        Nation n2 = new Nation();
        n2.name = "박달래";
        n2.age = 70;
        n2.gender = 'F';
        n2.introduce();
        n2.납세의의무();

    }
}
