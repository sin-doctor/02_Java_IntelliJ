package com.kh.pack2.pre3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public void method1(){
        String path = System.getProperty("user.home")+"/Desktop/lunch.txt";
        try {
            FileReader file = new FileReader(System.getProperty("user.home")+"/Desktop/lunch.txt");
            BufferedReader br = new BufferedReader(file); // 성능 향상용 객체
            String line; // 변수 선어만 하고 아무 값도 들어있지 않는 상태

            // while 내부에 readLine()을 작성하지 않으면 계속 똑같은 줄만 바라보고 있음!!
            while ((line = br.readLine()) !=null){
                System.out.println(line); // gㅎ
            }
            br.close();
            file.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
