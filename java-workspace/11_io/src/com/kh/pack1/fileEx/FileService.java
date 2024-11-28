package com.kh.pack1.fileEx;

import java.awt.*;
import java.io.File;

public class FileService {
    // method1 File 클래스 객체를 이용해서 폴더가 존재하지 않으면 폴더 생성
    public void method1(){
        //C:/Users/user1\바탕화면>
        //C:/Users/user1\Desktop>

        // 만약에 바탕화면에 만들고 싶다면?

        File 폴더 = new File(System.getProperty("user.home")+"/Desktop/newFolders");

        System.out.println("폴더 위치 :"+폴더.getPath());
        System.out.println("폴더 절대경로 : "+폴더.getAbsoluteFile());
        System.out.println("폴더 이름  : "+ 폴더.getName());
        System.out.println("폴더가 존재하는지 확인 : "+폴더.exists());

        폴더.mkdir();
        System.out.println("폴더 생성을 완료했습니다.");
    }
}
