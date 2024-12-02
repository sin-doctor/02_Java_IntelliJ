package com.kh.pack2.pre4;

import java.io.File;
import java.io.FileReader;

public class HappyLunchReadRun {
    public static void main(String[] args) {
        String path = System.getProperty("user.home")+"/Desktop/";
        String filename = "happyLunch.txt";

        HappyLunchRead frp = new HappyLunchRead();

        System.out.println("["+filename+"] 읽기모드를 시작합니다");
        frp.readTxt(path,filename);

    }
}
