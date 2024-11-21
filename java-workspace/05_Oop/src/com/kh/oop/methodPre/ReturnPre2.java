package com.kh.oop.methodPre;

public class ReturnPre2 {

    public String name(String name, int age) {
    return "안녕하세요! 제 이름은 " + name + "이고, 나이는 " + age + "세 입니다.";
    }
    public String LargeNum(int num1, int num2) {

        if (num1 < num2) {
            return num1 + " 보다 " + num2 + "이 큰 숫자입니다.";
        } else if (num2 < num1) {
            return num2 + " 보다 " + num1 + "이 큰 숫자입니다.";
        } else {
            return "두 숫자는 같습니다.";
        }

    }
    public String Score(int score) {
        char grade;
        if (score >= 90) {
            grade = 'A';
            return "입력한 점수: " + score + " 등급: " + grade;
        }else if (score >= 80) {
            grade = 'B';
            return "입력한 점수: " + score + " 등급: " + grade;
        }else if (score >= 70) {
            grade = 'C';
            return "입력한 점수: " + score + " 등급: " + grade;
        }else if (score >= 60) {
            grade = 'D';
            return "입력한 점수: " + score + " 등급: " + grade;
        }else if (score >= 50) {
            grade = 'E';
            return "입력한 점수: " + score + " 등급: " + grade;
        }else{
            grade = 'F';
            return "입력한 점수: " + score + " 등급: " + grade;
        }

    }
    public String Price(int price, int discountRate) {
        int finalPrice = price-(price*discountRate/100);
        return "원래 가격: " + price + "원 할인율: " + discountRate + "% 최종 금액: " + finalPrice + "원";
    }

    public String Age(int age){
        String message;
        if (age > 18) {
            message = "성인입니다.";
            return "나이: " + age + " 결과: " + message;
        }else if (age <= 17) {
            message = "미성년자입니다.";
            return "나이: " + age + " 결과: " + message;
        }else{
            message = "어린이입니다.";
            return "나이: " + age + " 결과: " + message;
        }
    }
    public String text(String str1,String str2){
        return str1 + " " + str2;
    }
    public String fruits(String arr1,String arr2,String arr3){

    }
}
