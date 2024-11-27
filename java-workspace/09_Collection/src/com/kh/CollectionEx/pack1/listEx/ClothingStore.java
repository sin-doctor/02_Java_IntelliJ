package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ClothingStore {
    //옷추가 기능과 추가된 옷 리스트들을 확인하는 기능
    // 모두에서 사용할 수 있도록 옷저장목록을 전역변수로 맨 위에 작성
    private ArrayList<Clothing> clothingList = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    // 옷 추가 기능
    public void addClothing() {

        System.out.print("옷이름 : ");
        String name = scanner.nextLine();

        System.out.print("카테고리 (상의/하의/외투 등):");
        String category = scanner.nextLine();

        System.out.print("가격 : ");
        String price = scanner.nextLine();

        Clothing c = new Clothing(name,category,price);
        clothingList.add(c); // 추가된 옷 이름 카테고리 가격 을 리스트에 저장
        System.out.println("[" + name + "] 추가 완료!");

    }
    public void removeClothing() {
        Scanner sc = new Scanner(System.in);
        System.out.print("제거하고자 하는 옷 이름을 입력하세요: ");
        String name = sc.nextLine();

        boolean found = false;
        Iterator<Clothing> iterator = clothingList.iterator();

       for(int i = 0; i<clothingList.size(); i++) {
           if(clothingList.get(i).getName().equals(name)) {
               clothingList.remove(i);
               System.out.println("["+name+"] 옷이 성공적으로 제거되었습니다.");
               found = true;
               break;
           }
       }

        if (!found) {
            System.out.println("일치하는 옷이 없습니다.");
        }
    }

    //추가된 옷 리스트들 확인하는 기능
    public void allClothing() {
        System.out.println("\n=== 추가된 옷 목록 ===");
        //만약에 등록된 옷목록이 존재하지 않다면

        if(clothingList.isEmpty()) {
            System.out.println("등록된 옷이 없습니다.");
        } else {
            // 하나씩 c 라는 변수명에 옷이름 카테고리 가격을 담아서
            for (Clothing c : clothingList) { //clothingList 에 담겨있는 옷들을
                System.out.println(c);
            }
        }
    }
}