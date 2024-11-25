package com.kh.run;

import com.kh.dto.학생;
import com.kh.service.학생서비스;
import com.kh.view.학생기능출력;

public class 학생기능실행 {
    public static void main(String[] args) {
        학생기능출력 s = new 학생기능출력();
        학생서비스 service = new 학생서비스();
        // 학생 정보를 입력하고
        System.out.println("학생 정보를 입력하느 공간입니다.");
        학생기능출력 print;
        학생 새로운학생=print.inputStudent();
        // 입력 받은 정보를 service에 추가
        service.학생추가하기(새로운학생.getStudentNumnber(),새로운학생.getStudent(),새로운학생.getGentder);
        // 입력 정보 출력
        System.out.println("저장된 학생정보 보기");
        print.display(service.getS1());
    }
}
