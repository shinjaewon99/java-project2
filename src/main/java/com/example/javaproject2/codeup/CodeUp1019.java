package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] inputString = in.next().split("\\.");


        int year = Integer.parseInt(inputString[0]);
        int month = Integer.parseInt(inputString[1]);
        int day = Integer.parseInt(inputString[2]);
        System.out.printf("%02d.%02d.%02d", year , month, day);

    }
}
