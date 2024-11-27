package com.kh.CollectionEx.pack2.setEx;

import java.util.HashSet;

public class 회원기능 {

    // 1. 회원 객체 생성 user
    private HashSet<회원> userSet = new HashSet<>();
    // 2. 회원 추가 기능 public void addUser(){}
    public void addUser(회원 user) {
        if(userSet.add(user)){
            System.out.println("유저가 추가되었습니다." + user);
        }else{
            System.out.println("이미 존재하는 유저입니다." + user);
        }
    }
    // 3. 회원 모두 조회 기능 public void allUser(){}
    public void allUser(){
        System.out.println("--- 모든 유저 조회하기 ---");
        if(userSet.isEmpty()){
            System.out.println("조회할 유저가 없습니다.");
        }else{
            for(회원 user : userSet){
                System.out.println(user);
            }
        }
    }
    // 4. 회원 검색 기능
    public void searchUser(int id){
        for(회원 user : userSet){
            if(user.getId() == id){
                break;
            }
        }
        System.out.println("검색된 유저가 없습니다");

    }

    // 5. 회원 삭제 기능
    public void deleteUser(int id){
        for(회원 user : userSet){
            if(user.getId() == id){
                userSet.remove(user);
                break;
            }
        }
        System.out.println("해당 유저는 삭제되었습니다.");
    }

}
