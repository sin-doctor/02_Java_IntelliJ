package com.kh.oop.constructorPre;

import java.util.Scanner;

public class CafeRun {
    // Scanner 이용해서
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("메뉴 이름 작성해주세요 :");
        String name = sc.nextLine();
        System.out.println("메뉴 가격을 작성해주세요 :");
        int price = sc.nextInt();
        System.out.println("메뉴 주문할 수량을 작성해주세요 :");
        int quantity = sc.nextInt();

        Cafe c = new Cafe(name,price,quantity);

        System.out.println(c.toString());
        System.out.println(c.getTotalPrice());
    }



    // 주문 받고 주문 받은 내용을 출력하는 기능 생성

    //1. main() 메서드 생성

    //2. main() 메서드 안에 Scanner 활용

    //3.Scanner 로 작성한 입력값을 모두 받아
    // 필수 생성자로 만들어진 객체에 변수명으로 저장

    //4.주문 출력

}
