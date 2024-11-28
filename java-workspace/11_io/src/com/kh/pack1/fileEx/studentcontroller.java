package com.kh.pack1.fileEx;

public class studentcontroller {
    private student[] students;

    public void StudentController() {
        students = new student[]{
        new student("김길동", "자바", 100),
                new student("박길동", "디비", 50),
                new student("이길동", "화면", 85),
                new student("정길동", "서버", 60),
                new student("홍길동", "자바", 20)};

    }
    public student[] printStudent() {
        return students;
    }
    public int sumScore() {
        int sum = 0;
        for (student student : students) {
            sum += student.getScore();
        }
        return sum;
    }
    public double[] avgScore() {
        double[] result = new double[2];
        int sum = sumScore();
        result[0] = sum; // 합계
        result[1] = (double) sum / students.length; // 평균
        return result;
    }
}
