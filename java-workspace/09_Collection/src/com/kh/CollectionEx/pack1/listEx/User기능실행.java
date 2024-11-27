package com.kh.CollectionEx.pack1.listEx;

import java.util.Scanner;

public class User기능실행 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User기능 userStore = new User기능();

        while (true){
            System.out.println("\n --- 사용자 관리 프로그램 ---");
            System.out.println("1. 사용자 추가");
            System.out.println("2. 추가된 유저 목록 모두 조회");
            System.out.println("3. 유저 삭제");
            System.out.println("4. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1: userStore.addUser();
                break;
                case 2:
                    userStore.allUsers();
                    break;
                    case 3:
                        userStore.removeUser();
                    case 4:
                        System.out.println("프로그램 종료");
                        return;
                        default:
                            System.out.println("번호를 잘못 입력했습니다. 다시 입력하세요.");
                            break;
            }
        }
    }
}
