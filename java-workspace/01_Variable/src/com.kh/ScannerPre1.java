package com.kh;
/*
*  import java.util.Scanner;
*  import = 외부 폴더나 내부 폴더에서 특정 파일을 가져오기
*  import 폴더명1. 폴더명2. 파일명;
*  다른 파일에서 특정 파일을 가져와 사용할 때는
*  파일명 맨 앞글자가 영어로 대문자인지 확인하기
*  파일이름을 소문자로 모두 작성한 경우 외부에서 파일 가져오기 X
*
* 자바 자체에서 만든 파일이름과 똑같은 파일이름 만들기 금지!!!
*
* */
import java.util.Scanner;

public class ScannerPre1 {
    public static void main(String[] args) {
        // 외부에서 가져온 파일명 작성
        // 자료형 변수명 = 새로운 스캐너시작(프로그램 내에서 작성한 값 읽기모드);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number1: ");
        int number1 = sc.nextInt(); //정수 1번 입력
        System.out.println("Enter a number2: ");
        int number2 = sc.nextInt(); //정수 2번 입력
        System.out.println("Enter a num3: ");
        float number3 = sc.nextFloat(); //실수값으로 입력받기 3번 입력
        //반드시 next 라는 값을 사용하기 전에 프린트로 어떤값을
        //입력해야하는지 출력해서 눈으로 보여줄것
        // 자동으로 정렬하는 단축키 ctrl + alt +L
        System.out.println("이름 입력하기:");
        String name = sc.next();

        System.out.println(number1+number2+number3+name);
        /** 매번 new Scanner(System.in)작성하기 번거롭기 때문에
        * 맨위에 sc라는 변수명으로 스캐너에서 사용자가 키보드로 입력한 값을*/
    }
}


