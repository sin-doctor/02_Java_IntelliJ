package com.kh.oop.methodPre;

public class ReturnPre1 {

    // 가상의 사용자 데이터
    // 이름 핸드폰번호 아이디
    public String name = "홍길동"; // 이름
    public int phone = 1234; //핸드폰 번호
    public String id = "dongdong1004";// 아이디 0개의 사용위치

    // 이름과 핸드폰 번호가 일치하는 아이디를 전달하기
    public String findId(String a, int b){
        //이름과 핸드폰 번호가 일치하는지 확인
        // return "dongdong1004";

        // 만약에 이름과 핸드폰번호가 일치한 고객이라면 아이디를 전달
        if(name.equals(a) && phone == b ){
            return id;
        }

        // 일치하지 않는 고객이라면 조회된 정보가 없습니다. 전달
        return "아이디를 찾을 수 없습니다.";
    }

    //계산기

    public  double add(double a, double b){
        return a + b;
    }
    public  double sub(double a, double b){
        return a - b;
    }
    public  double mul(double a, double b){
        return a * b;
    }
    public  double div(double a, double b){
        return a / b;
    }
}
