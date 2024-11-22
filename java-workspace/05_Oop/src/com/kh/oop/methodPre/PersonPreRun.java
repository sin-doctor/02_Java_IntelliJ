package com.kh.oop.methodPre;

import java.util.Scanner;

public class PersonPreRun {
    public static void main(String[] args) {
        PersonPre pp = new PersonPre();
        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하세요 : ");
        String n = sc.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        if (n.trim().length() == 0) {
            System.out.print("빈칸은 이름으로 들어갈 수 없습니다.");
        } else {
            pp.setName(n);
        }

        if (age <= 0) {
            System.out.println("나이는 0이나 음수일 수 없습니다.");
        } else {
            pp.setAge(age);
        }
        if (pp.getName() != null && pp.getAge() > 0) {
            System.out.println("이름:" + pp.getName());
            System.out.println("나이:" + pp.getAge());
        }


    }

    //스캐너로 사용자 이름과 나이를 입력받고
    //이름은 빈칸이라면 빈칸은 이름으로 들어갈 수 없습니다.

    //나이가 0보다 같거나 작다면 나이는 음수일 수 없습니다 로 값 설정 x
    //이름이 제대로 들어가있고 나이가 제대로 설정이 되어 있다면 get으로 이름과 나이 출력하기
}
