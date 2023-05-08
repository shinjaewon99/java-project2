package com.example.javaproject2.week4.day1;

public class UserTest{

    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "김미미";
        user1.age = 14;

        boolean isAdult = user1.isAdult();

        System.out.printf("%s는 %d살이고, %b입니다.", user1.name, user1.age, isAdult);
    }
}
