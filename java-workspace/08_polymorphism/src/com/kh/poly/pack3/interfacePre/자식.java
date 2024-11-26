package com.kh.poly.pack3.interfacePre;
// extends = 하나만 상속 가능
// implements = 엄마아빠가 모두 인터페이스 일때 둘다 상속가능

// 강제로 기능 구현해야하는 엄마 추상클래스 상속 받고
// 아빠의 기능도 진행하겠다 아빠의 인터페이스에 작성된 메서드도 진행
public class 자식 extends 엄마 implements 아빠{
    @Override
    public void 책읽기() {
        System.out.println("자식은 책을 읽습니다.");
    }

    @Override
    public void 스포츠활동() {
        System.out.println("자식은 운동을 합니다.");
    }
}

