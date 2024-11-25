package com.kh.service;

import com.kh.dto.과자;

public class 과자추가기능 {
    private 과자[] snacks; // 과자 배열
    // 과자별로 이름, 맛, 가격을 배열로 넣는다
    {   // 이름 가격  맛  순으로 저장
        {"썬칩", 2000, "매콤한 맛"},
        {"고래밥", 1000, "고소한맛"},
        {"포카칩",1500,"생감자맛"}
    }
    private int count; // 현재 저장된 과자 수

    public 과자추가기능(int maxSnacks) {
        this.snacks = new 과자[maxSnacks];
        this.count = 0;
    }

    // 과자 추가 기능 설정
    public boolean addSnack(String name, int price, String flavor){
        // 만약에 과자를 성공적으로 추가했다면
        if(count < snacks.length){
            snacks[count++] = new 과자(name, price, flavor); // 배열에 과자 이름 맛 가격을 추가
            return true; // 성공적으로 추가 완료했을 때 true 표기
        }
        return false; // 배열이 가득차서 추가 불가
    }

    // 과자 배열 반환
    public 과자[] getSnacks(){
        return snacks;
    }
    // 저장된 과자 개수 반환
    public int getCount(){
        return count;
    }
}
