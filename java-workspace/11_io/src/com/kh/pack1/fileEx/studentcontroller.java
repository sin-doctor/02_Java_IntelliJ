package com.kh.pack1.fileEx;

public class studentcontroller {
    private student[] sArr = new student[5];
    public static final int CUT_LINE = 60;

    public studentcontroller() {
        sArr[0] = new student("김길동","자바",100);
        sArr[1] = new student("박길동","디비",50);
        sArr[2] = new student("이길동","화면",85);
        sArr[3] = new student("정길동","서버",60);
        sArr[4] = new student("홍길동","자바",20);
    }

    public student[] printStudent() {
        return sArr;
    }

    public int sumScore(){
        int sum = 0;
        for(student s : sArr){
            sum += s.getScore();
        }
        return sum;
    }
    public double[] avgScore(){
        int sum = sumScore();
        double avg = (double)sum/(double)sArr.length;
        return new double[]{avg,sum};
    }
}
