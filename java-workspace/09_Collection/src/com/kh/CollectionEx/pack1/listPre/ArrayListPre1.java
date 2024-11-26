package com.kh.CollectionEx.pack1.listPre;

import java.util.ArrayList;

public class ArrayListPre1 {
    public void method1(){
        ArrayList<String> list = new ArrayList<String>();

        list.add("새우깡");
        list.add("맛동산");
        list.add("포카칩");
        list.add("고구마칩");
        list.add("고래밥");

        System.out.println("list에 들어있는 값 : "+list);
        System.out.println("list에 들어있는 총 갯수 : "+ list.size());

        // 만약에 index 1자리에 허니버터칩을 넣고 싶다면 -> add(index자리넘버, 넣고자하는값)
        list.add(1,"허니버터칩");
        System.out.println("list에서 허니버터칩 추가 확인 :" + list);
        // 3. 특정 위치의 값 가져오기 get(int index자리넘버)
        // 3번째 작성된 값이 무엇인지 가져올 예정
        System.out.println("3번째 인덱스에 저장된 값:"+ list.get(3));

        // 4. 2번째 저장된 값을 망고과자로 변경 set(index자리넘버, 변경할 값)
        list.set(2,"망고과자");
        System.out.println("망고과자로 변경됐는지 확인: "+list);

        // 5. 특정 위치의 값을 삭제 remove("삭제할 값") or remove(index자리값)
        list.remove(1);
        System.out.println("index 1번 자리 값 삭제 : "+list );

        list.remove("포카칩");
        System.out.println("포카칩이 무사히 사라졌는지 확인: "+list);

        // 6. contains("값") or contains(index자리값) 리스트에 찾는 값이 들어있는지 확인
        System.out.println("망고과자가 존해하나요?"+ list.contains("망고과자"));

        // 7. clear(); list안에 들어있는 모든 값 삭제
        list.clear();
        System.out.println("리스트 안에 값이 깨끗하게 지워졌나요? : " + list.isEmpty());

        // contains , isEmpty 는 값이 boolean 값으로 나옴

    }

    /*
    *  method2 과일을 저장하고 수정하고 삭제하고 비우고
    *   무사히 비웠는지 확인하는 기능
    * 사과 포도 바나나 망고
    * */
    public void method2(){
        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("사과");
        list1.add("포도");
        list1.add("바나나");
        list1.add("망고");

        System.out.println("list1에 들어있는값 : "+ list1);


        //과일 리스트의 두 번째 위치에 오렌지를 추가하세요.
        list1.add(1,"오렌지");
        System.out.println("list에서 오렌지 추가 확인 :" + list1);

        // 리스트에서 바나나 -> 파인애플로 변경하세요!
        list1.set(1,"파인애플");
        System.out.println("파인애플로 변경됐는지 확인: "+list1);

        //리스트에서 첫 번째 과일을 삭제하세요!
        list1.remove(0);
        System.out.println("첫번째 과일이 사라졌는지 확인 : "+list1);

        //리스트에서 망고를 삭제하세요!
        list1.remove("망고");
        System.out.println("망고가 삭제됐는지 확인 : "+list1);

        //리스트에 사과가 남아있는지 확인하고 사과가 만약에 있다면 사과를 없애고 출력하세요!
        if(list1.contains("사과")){
            list1.remove("사과");
            list1.remove("사과를 삭제한 리스트 : "+list1);
        }else{

        }

        //리스트를 비우고, 리스트가 비어 있는지 확인하고 결과를 출력하세요.
        System.out.println(list1.isEmpty());
    }

    /* method3 기본 타입으로 자료형 제한해서 저장*/
    public void method3(){
        // 1. 정수(int)타입 제한
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        intlist.add(1);
        intlist.add(20);
        intlist.add(300);
        System.out.println("IntList : "+ intlist);

        // 2. 문자(char)타입 제한
        ArrayList<Character> charlist = new ArrayList<Character>();
        charlist.add('a');
        charlist.add('b');
        charlist.add('c');
        System.out.println("CharList : "+ charlist);

        // 3. 논리 타입 제한 true false 리스트에 저장
        //boolList
        ArrayList<Boolean> boolList = new ArrayList<>();
        boolList.add(true);
        boolList.add(false);
        System.out.println("BoolList : "+ boolList);


        // 4. 실수 (double) 타입 제한 doubleList
        // 1.5 3.14값을 저장
        ArrayList<Double> doublesList = new ArrayList<>();
        doublesList.add(1.5);
        doublesList.add(3.14);
        System.out.println("DoublesList : "+ doublesList);
    }
}
