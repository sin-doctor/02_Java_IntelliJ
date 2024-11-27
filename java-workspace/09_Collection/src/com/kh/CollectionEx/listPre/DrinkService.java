package com.kh.CollectionEx.listPre;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DrinkService {

    ArrayList<Drink> drinks = new ArrayList<Drink>();
    //1. Drink 객체 생성 d
    Drink d = new Drink();

    //2. Drink 음료 이름 가격 추가
    public void addDrink(String drinkName, int drinkPrice) {
        Drink d = new Drink(drinkName, drinkPrice);
        drinks.add(d);
        System.out.print(drinks);
        System.out.println(drinkName+"(이)가 성공적으로 추가되었습니다.");
    }

    //3. Drink 음료 이름 가격 모두 조회
    public void allDrinks() {
        System.out.println("\n=== 음료 목록 ===");
        if(drinks.isEmpty()){
            System.out.println("등록된 음료가 없습니다!");
        }else{
            for (Drink d : drinks) {
                System.out.println(d);
            }
        }
    }

    //4. Drink 음료 특정 음료 삭제
    public void removeDrink(String name) {
        for(int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).getName().equals(name)) {
              drinks.remove(i);
              System.out.println("["+name+"] 이 성공적으로 제거되었습니다.");

            }
        }
    }

    //5. Drink 음료 특정 음료 검색
    public void searchDrink(String name) {
        for (Drink d : drinks) {
            if(d.getName().equals(name)) {
                System.out.println(d);
                break;
            }else{
                System.out.println("검색된 음료가 없습니다");
            }
        }

    }

    //6. Drink 음료 특정 음료 검색 -> 가격을 통해 검색
    public void searchDrink(int price) {
        for (Drink d : drinks) {
            if(d.getPrice() == price) {
                System.out.println(d);
                break;
            }else{
                System.out.println("검색된 음료가 없습니다");
            }
        }

    }
}
