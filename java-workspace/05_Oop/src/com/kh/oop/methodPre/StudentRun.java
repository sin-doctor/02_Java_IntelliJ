package com.kh.oop.methodPre;

public class StudentRun {
    public static void main(String[] args) {
        Student s = new Student();
        // Student 객체 s 생성

        // 이름 = 홍길동 나이 = 17 = 성별 = 남성 전공 컴퓨터공학
        s.setName("홍길동");
        s.setAge(17);
        s.setGender("남성");
        s.setMajor("컴퓨터공학");

        // Student 객체 저장된 값 출력
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getGender());
        System.out.println(s.getMajor());

        System.out.println("=== 학생정보찾기 ===");

    }
}
