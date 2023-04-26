package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1033 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        String converter = Integer.toHexString(number);
        String toUpperString = converter.toUpperCase(); // .toUpperCase() : 문자열을 대문자로 변경
        System.out.println(toUpperString);
    }
}
