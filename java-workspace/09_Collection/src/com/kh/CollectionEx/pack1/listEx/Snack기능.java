package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Snack기능 {

    private ArrayList<Snack> snacksList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addSnack() {

        System.out.print("과자명을 입력하세요 :");
        String name = sc.nextLine();

        System.out.print("과자 가격을 입력하세요 : ");
        int price = sc.nextInt();

        System.out.print("과자 재고수량을 입력하세요 : ");
        int quantity = sc.nextInt();

        sc.nextLine();
        sc.close(); // 스캐너 종료

        // 과자정보를 저장하는 저장클래스 소환

        Snack snack1 = new Snack(name, price, quantity); //Scanner로 입력받은 과자명, 가격, 수량이 들어감
        Snack snack2 = new Snack("오맛난과자",1000, 400); //Scanner로 입력받은 과자명, 가격, 수량이 들어감
        Snack snack3 = new Snack("맛동산", 3023, 23232); //Scanner로 입력받은 과자명, 가격, 수량이 들어감

        // 과자 정보를 목록으로 저장하느 배열리스트 소환
        ArrayList<Snack> snacks = new ArrayList<Snack>();
        snacks.add(snack1); // 과자목록에 새로 입력받은 과자 한 개에 대한 정보를 저장
        snacks.add(snack2); // 과자목록에 새로 입력받은 과자 한 개에 대한 정보를 저장
        snacks.add(snack3); // 과자목록에 새로 입력받은 과자 한 개에 대한 정보를 저장
        System.out.println(" **** 과자 목록 리스트 출력 ***** ");
        for (int i = 0; i < snacks.size(); i++) {
            snacks.get(i);
            System.out.println(snacks.get(i));
        }
    }
    public void removeSnack() {
        Scanner sc = new Scanner(System.in);
        System.out.println("제거 하고자 하는 과자의 이름을 입력하세요 : ");
        String nameToRemove = sc.nextLine();

        boolean found = false;
        Iterator<Snack> iterator = snacksList.iterator();

        while (iterator.hasNext()) {
            Snack snack = iterator.next();
            if (snack.getSnackname().equals(nameToRemove)) {
                iterator.remove();
                found = true;
                System.out.println("과자 이름" + nameToRemove + "이(가) 제거 되었습니다.");
                break;
            }
        }
        if (!found) {
            System.out.println("일치하는 과자가 없습니다.");
        }
    }
}
