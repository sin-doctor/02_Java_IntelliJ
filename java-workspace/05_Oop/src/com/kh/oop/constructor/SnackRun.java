package com.kh.oop.constructor;

public class SnackRun {
    public static void main(String[] args) {
        Snack sr1 = new Snack();
        sr1.setName("초코칩 쿠키");
        sr1.setPrice(1500);
        sr1.setTaste("달콤한 초코맛");

        Snack sr2 = new Snack();
        sr2.setName("허니버터칩");
        sr2.setPrice(2000);
        sr2.setTaste("달콤한 버터맛");

        Snack sr3 = new Snack("새우깡",1200,"짭잘한 새우맛");

        System.out.println(sr1.toString());
        System.out.println(sr2.toString());
        System.out.println(sr3.toString());
    }
}
