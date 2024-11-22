package com.kh.oop.methodPre;

public class ReturnPre2 {

    public String method1(String name, int age) {
        return "안녕하세요! 제 이름은 " + name + "이고, 나이는 " + age + "세 입니다.";
    }

    public String method2(int num1, int num2) {

        if (num1 < num2) {
            return num1 + " 보다 " + num2 + "이 큰 숫자입니다.";
        } else {
            return num2 + " 보다 " + num1 + "이 큰 숫자입니다.";
        }

    }

    public String method3(int score) {
        char grade;
        if (score >= 90) {
            grade = 'A';
            return "입력한 점수: " + score + " 등급: " + grade;
        } else if (score >= 80) {
            grade = 'B';
            return "입력한 점수: " + score + " 등급: " + grade;
        } else if (score >= 70) {
            grade = 'C';
            return "입력한 점수: " + score + " 등급: " + grade;
        } else if (score >= 60) {
            grade = 'D';
            return "입력한 점수: " + score + " 등급: " + grade;
        } else if (score >= 50) {
            grade = 'E';
            return "입력한 점수: " + score + " 등급: " + grade;
        } else {
            grade = 'F';
            return "입력한 점수: " + score + " 등급: " + grade;
        }

    }

    public String method4(int price, int discountRate) {
        int finalPrice = price - (price * discountRate / 100);
        return "원래 가격: " + price + "원 할인율: " + discountRate + "% 최종 금액: " + finalPrice + "원";
    }

    public double method5(int[] numbers) {
        int sum = 0;
        double average;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;

    }


    public String method6(int age) {
        String result = (age >= 19) ? "성인입니다" : "미성년자입니다";
        return "나이 :" +age+" 결과 : " + result;
    }

    public String method7(String str1, String str2) {
        String result = str1 + str2;
        return "첫 번째로 입력된 문자열 : " + str1 +"\n 두 번째로 입력된 문자열 : "+ str2+ "\n 두문자열을 이어붙인결과 :" +result;
    }
    public String method8(String []arr, String target) {
        boolean found = false;

        for(String s : arr) {
            if(s.equals(target)) {
                found = true;
                break;
            }
        }
        if(found) {
            return "배열에"+target+"이(가) 존재합니다.";
        }else {
            return "배열에" + target + "이(가) 존재하지않습니다.";
        }
    }
    public String method9(double radius) {
        double area = Math.PI * radius * radius;
        return "반지름 : "+radius+"원의 넓이 : "+area;
    }
}
