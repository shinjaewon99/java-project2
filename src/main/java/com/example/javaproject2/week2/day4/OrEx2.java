package com.example.javaproject2.week2.day4;

public class OrEx2 {
    public static void main(String[] args) {
        int project = 20;
        int exp = 10;

        boolean check = project >= 10 || exp >= 5;

        System.out.printf("팀장으로 승진이 : %b", check);
    }
}
