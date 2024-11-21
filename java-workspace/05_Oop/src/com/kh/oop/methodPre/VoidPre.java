package com.kh.oop.methodPre;

public class VoidPre {
    //메서드1: 온도 변화 확인하기
    // + double
    public void method1(double celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("섭씨"+celsius+"도는 화씨"+ fahrenheit+"도 입니다.");
    }
    public void method2(String name) {
        System.out.println("학생이름 :"+ name);
    }
    public void method3(String itemName,int price) {
        System.out.println("상품명:"+itemName+", 가격:"+price+"원");
    }
    public void method4(int hours,int minutes) {
        int total = hours*60+minutes;
        System.out.println("총"+total+"분 입니다.");
    }
    public void method5(String exercise,int duration) {
        System.out.println("운동:"+exercise+",지속 시간:"+duration+"분");
    }
    public void method6(String accountNumber,double balance) {
        System.out.println("계좌번호:"+accountNumber +", 잔액:"+ balance+"원");
    }
    public void method7(String title,String rating ){
        System.out.println("영화 제목:"+title+ ", 평점:"+rating);
    }
    public void method8(String car,int topSpeed ){
        System.out.println("차량명:"+ car+", 최고 속도:"+topSpeed+"km/h");
    }
    public void method9(String recipient ,String log ){
        System.out.println("수신자:"+recipient +", 제목:"+ log);
    }
    public void method10(String itemName1,int quantity){
        System.out.println("상품명:"+ itemName1 +"케이스, 수량:"+quantity+"개");
    }
}
