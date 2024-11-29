package com.kh.pack1.fileEx;

public class StudentRun {
    public static void main(String[] args) {
       studentcontroller sc = new studentcontroller();



        System.out.println("==========학생 정보 출력==========");
        for (student student : sc.printStudent()) {
            System.out.println(student);
        }



        System.out.println("==========학생 성적 출력==========");
        double[] scores = sc.avgScore();
        System.out.println("학생 점수 합계 : " + (int) scores[0]);
        System.out.println("학생 점수 평균 : " + (int) scores[1]);


        System.out.println("==========성적 결과 출력==========");
        for (student student : sc.printStudent()) {
    }
}
}