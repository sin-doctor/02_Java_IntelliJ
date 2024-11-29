package com.kh.pack2.pre3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderPre {
    // 파일을 읽고 읽은 내용을 눈으로 확인
    // happyLunch.txt
    /*
     * readTxt(String path, String fileName )
     *
     * @param path = 파일 경로
     * @param fileName = 파일이름
     * */
    public void readTxt(String path, String fileName) {
        File file = new File(path + fileName);
        if (!file.exists()) {
            System.out.println("파일이 존재하지 않습니다: " + fileName);
            return;
        }

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // 한 줄씩 출력
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException("파일 읽기 중 오류 발생: " + e.getMessage(), e);
        }
    }
}