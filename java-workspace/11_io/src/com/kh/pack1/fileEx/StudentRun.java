package com.kh.pack1.fileEx;

public class StudentRun {
    public static void main(String[] args) {
       studentcontroller sc = new studentcontroller();


    // 학생 정보 출력
        System.out.println("==========학생 정보 출력==========");
        for (student student : sc.printStudent()) {
            System.out.println(student);
        }


    // 학생 성적 합계 및 평균 출력
        System.out.println("==========학생 성적 출력==========");
    double[] scores = sc.avgScore();
        System.out.println("학생 점수 합계 : " + (int) scores[0]);
        System.out.println("학생 점수 평균 : " + scores[1]);

    // 성적 결과 출력
        System.out.println("==========성적 결과 출력==========");
        for (student student : sc.printStudent()) {
        if (student.getScore() == scores[0]) {
            System.out.println(student.getName() + "학생은 통과입니다.");
        } else {
            System.out.println(student.getName() + "학생은 재시험 대상입니다.");
        }
    }
}
}