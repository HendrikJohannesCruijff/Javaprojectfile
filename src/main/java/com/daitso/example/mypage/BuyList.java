package com.daitso.example.mypage;

public class BuyList {
    public void buyListScreen(){
        User user = new User();
        System.out.println("┏━━━━━━━━━━━━━━━━━━━구매/판매 목록━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println(" [구매 기록]");
        System.out.println("번호 : " + user.getNum());
    }
}
