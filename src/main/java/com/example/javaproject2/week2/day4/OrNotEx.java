package com.example.javaproject2.week2.day4;

public class OrNotEx {
    public static void main(String[] args) {
        int age = 25;
        boolean isAdult = age >= 18;

        System.out.printf("미성년자 입니까 ? : %b", !isAdult);
    }
}
