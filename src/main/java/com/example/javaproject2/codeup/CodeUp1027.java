package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] inputString = in.next().split("\\.");
        int day = Integer.parseInt(inputString[2]);
        int month = Integer.parseInt(inputString[1]);
        int year = Integer.parseInt(inputString[0]);

        // '-'을 포함해 출력
        System.out.printf("%02d-%02d-%04d", day, month, year);
    }
}
