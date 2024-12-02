package com.kh.pack2.pre4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HappyLunchRead {
    public void readTxt(String fileName,String path) {
        try {
            FileReader fr = new FileReader(path+fileName); // 한글자씩 읽지만
            BufferedReader br = new BufferedReader(fr); // 버퍼드로 한줄씩 읽게함
            String line;

            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다. : "+e.getMessage());
        } catch (IOException e) {
            System.out.println("파일을 찾을 수 없는 문제 이외에 다른 문제가 발생했습니다. ");
        }

    }

}
