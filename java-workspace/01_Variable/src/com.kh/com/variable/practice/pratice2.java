package com.kh.com.variable.practice;

import java.util.Scanner;

public class pratice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 1번:");
        int num1 = sc.nextInt();
        System.out.println("숫자 2번:");
        int num2 = sc.nextInt();
        System.out.println("숫자 3번:");
        int num3 = sc.nextInt();
        System.out.println("총점 :" + (num1+num2+num3));
        System.out.println("평균 :" + (num1+num2+num3)/3);
    }
}
