package com.kh.CollectionEx.pack3.mapEx;

import java.util.HashMap;

public class SnackService {

    public void method1(){
        HashMap<String,Integer> snackList = new HashMap<>();

        snackList.put("구름과자",2000);

        System.out.println("과자이름 출력 : "+snackList);

    }
    // method2 점심메뉴 저장 (키 : 메뉴이름 값 : 분류)
    public void method2(){
        HashMap<String,String> lunchList = new HashMap<>();

        lunchList.put("김치찌개","한식");
        lunchList.put("파스타","양식");
        lunchList.put("짜장면","중식");
        lunchList.put("스테이크","양식");
        lunchList.put("비빔밥","한식");

        System.out.println("점심리스트 확인 : "+lunchList);

        System.out.println(lunchList.get("파스타"));


        lunchList.remove("짜장면");
        System.out.println("짜장면 무사히 제거됐는지 확인 : " +lunchList);

        boolean jjajang = lunchList.containsKey("짜장면");
        System.out.println(jjajang);

        lunchList.put("스테이크","한식");
        System.out.println("스테이크가 한식으로 변경됐는지 확인 : "+lunchList);

        // replace
        lunchList.replace("스테이크","한식"); // 위 put에 작성된 스테이크 값을 한식으로 변경할 수 있음

        lunchList.clear();
        System.out.println("점심리스트 확인 : "+ lunchList);

        boolean tf = lunchList.isEmpty();
        System.out.println(tf);
        //is Empty 결과 또한 boolean이기 때문에 자료형 boolean 변수명으로 담아서 사용할 수 있음

    }
}
