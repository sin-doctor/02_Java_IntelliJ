package com.kh.pack1.filePre;

import java.io.File;
import java.io.IOException;

public class FolderPre1 {

    public void method1(){
        File 폴더 = new File(System.getProperty("user.home")+"/Desktop/profileImg");

        System.out.println("폴더 위치 :"+폴더.getPath());
        System.out.println("폴더 절대경로 : "+폴더.getAbsoluteFile());
        System.out.println("폴더 이름  : "+ 폴더.getName());
        System.out.println("폴더가 존재하는지 확인 : "+폴더.exists());

        폴더.mkdir();
        System.out.println("폴더 생성을 완료했습니다.");
    }

    public void method2(){
        File txtFile = new File(System.getProperty("user.home")+"/Desktop/profileImg/txtFile.txt");
        if(txtFile.exists()){
            System.out.println("파일이 존재합니다/");
        }else {
            try {
                txtFile.createNewFile();
                System.out.println("파일을 성공적으로 생성했습니다.");
            } catch (IOException e) {
                System.out.println("파일 생성 중 예기치 못한 문제가 발생했습니다.");
            }
        }
    }
}
