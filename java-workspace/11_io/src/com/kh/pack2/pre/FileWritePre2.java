package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre2 {
    // 바탕화면 lunch.txt
    // 먹고싶은 점심매뉴 리스트를 줄바꿈을 이용해서 작성하고
    // 파일이 존재한다면 이미지 존재합니다 와 동시에 프로그램 return 으로 종료
    // main() 메서드 작성
    public static void main(String[] args) {

        System.getProperty("user.home");
        File file = new File(System.getProperty("user.home")+"/Desktop/lunch.txt");

        try {
            if (file.exists()) {
                System.out.println("파일이 이미 존재합니다.");
                return;
            }else {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("파일 만들기 실패");
            return;
        }

        try {
            FileWriter fw = new FileWriter(file);
            String content = "먹고 싶은 점심메뉴 \n 샥스핀 \n 중화볶음밥 \n 탕수육 \n 내장국밥";
            fw.write(content);
            fw.close();
            System.out.println("파일에 내용이 작성되엇습니다.");

           
        } catch (Exception e) {
            System.out.println("글자 작성에 실패했습니다. 다시 시도해주세요.");

        }finally {
            System.out.println("글쓰기 작업을 종료합니다.");
        }
    }
}
