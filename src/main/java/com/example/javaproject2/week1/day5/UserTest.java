package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User jaewon = new User();
        jaewon.name = "신재원";
        jaewon.phoneNumber = "010-5555-5555";
        jaewon.age = 25;

        System.out.printf("재원은 성인 일까요? : %s", jaewon.isAdult());
    }
}
