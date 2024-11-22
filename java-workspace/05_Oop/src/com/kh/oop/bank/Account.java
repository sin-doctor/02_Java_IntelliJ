package com.kh.oop.bank;
/* 계좌 클래스 */
public class Account {
    // 속성(값)
    private String name; //이름(계좌번호 주인)
    private String accountNumber; // 계좌번혼
    private double balance; //잔액
    private String password; //비밀번호

    //Setter


    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Getter


    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    //기능 설정 = method 설정
    // 전달받은 금액을 balance에 누적한 후 현재 잔액을 콘솔창에 출력하기
    public void deposit(double amount) {
        // 만약에 0원 이하 입금을 하면 잘못된 입금 금액입니다. 만 출력하기
        balance += amount;
        if (amount <= 0){
            System.out.println("잘못된 입금 금액입니다.");
        }else{
            System.out.println(name+"의 현재 잔액: "+balance);
        }
    }
    public void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("잔액이 부족합니다");
            System.out.println("현재 계좌 잔액:" + balance + "원");
            return; //출금 중지 기능종료
        }
        if (amount <= 0) {
            System.out.println("잘못된 출금 금액입니다");
            return;
        }
        balance -= amount;
        System.out.println(name+"의 현재 잔액 :"+balance+"원");

    }

    //출금메서드 만들기
    // 계좌 잔액보다 금액이 부족하면 잘못된 출금 금액이거나 잔액이 부족합니다.
}
