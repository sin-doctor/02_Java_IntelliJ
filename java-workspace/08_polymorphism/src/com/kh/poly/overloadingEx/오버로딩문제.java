package com.kh.poly.overloadingEx;

public class 오버로딩문제 {


       // 아래 기준 메소드를 먼저 써놓고 1번부터 7번까지의
       // 메소드를 차례로 써나간다고 할 때 오버로딩이 적용되는 것은 무엇일까?

       //기준
        public void method1(int i){}
       // =========================
      //  1 public void method1(String str){}
           // 1번의 경우 매개변수 타입 다르므로 적용가능
     //   2 public void method1(int i, String str){}
            // 2번의 경우 매개변수갯수와 타입이 다르기에 적용가능
       // 3 public void method1(int num){} -> 타입을 추가해서 오버로딩 적용시키기
            // 3번의 경우 매개변수갯수와 타입이 같으므로 불가
       // 4 public char method1(int point){}
            // 기준의 작성된 method1과 매개변수의 타입, 개수가 같아서 오버로딩 적용 불가 XXX
            // 매개변수명과 void 유무는 오버로딩이 되는 조건과 상관없음
      //  5 public void method1(int i, int k){}
            // 갯수가 다르므로 가능
      //  6 public void method1(int num, String string){}
            // 2번에 작성된 메서드와 매개변수명의 타입과 순서, 개수가 모두 같아서 오버로딩 적용 불가
    // 오버로딩 조건에서 매개변수명은 오버로딩이 되는 조건과 상관 없음! 오직 개수와 타입만 봄
    // 7 오버로딩 적용가능 매개변수명에서 자료형의 순서가 같은게 없기 때문에 ok
    //    7 public void method1(String str, int i){}

    /**
     * 오버로딩이 되는 조건
     * 매개변수의 개수가 다르거나 종류가 다르거나 순서가 다르거나 일 때 오버로딩이 적용된다.
     * 매개변수 명과 반환 타입은 오버로딩 조건에 상관이 없음
     **/



}
