package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre {
    public static void main(String[] args) {
        // 바탕화면에 hello.txt 만들고
        // 안녕하세요 Hello Hi
        System.getProperty("user.home");
        File file = new File(System.getProperty("user.home")+"/Desktop/hello.txt");

        try {
            if (!file.exists()) {
                System.out.println("파일이 이미 존재합니다.");
                return; // 파일이 이미 존재하고 덮어쓰기가 돼서
                //  글 작성이 되는 것을 방지하기 위해 return 돌려보내기 추가
            }else {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("파일 만들기 실패");
            return; //프로그램에서 더 이상 코드를 실행하지 않겠다는 return 돌려보내기
        }

        try {
            FileWriter fw = new FileWriter(file);
            String content = "안녕하세요. Hello Hi";
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
