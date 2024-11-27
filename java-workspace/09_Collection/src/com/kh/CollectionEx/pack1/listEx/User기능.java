package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class User기능 {
    private ArrayList<User> userList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public void addUser() {
        System.out.println("\n === 사용자 추가 === ");
        System.out.println("사용자 명 : ");
        String username = sc.nextLine();

        System.out.println("비밀번호 : ");
        String password = sc.nextLine();

        System.out.println("이메일 : ");
        String email = sc.nextLine();

        User newUser = new User(username, password, email);
        userList.add(newUser);
        System.out.println("[" + username + "] 추가 완료!");
    }
    public void allUsers() {
        System.out.println("\n=== 추가된 사용자 목록 ===");

        if (userList.isEmpty()) {
            System.out.println("등록된 유저가 없습니다.");
        }else{
            for (User user : userList) {
                System.out.println(user);
            }
        }
    }
    public void removeUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("제거하고자하는 유저의 이름을 입력해주세요 : ");
        String username = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equals(username)) {
                userList.remove(i);
                System.out.println("["+username+"] 이(가) 성공적으로 제거되었습니다.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("[ " + username + " ] 유저를 찾을 수 없습니다.");
        }

    }
}
