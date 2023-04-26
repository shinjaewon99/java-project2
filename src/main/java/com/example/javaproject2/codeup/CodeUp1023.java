package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();

        // 문자열을 '.'을 기준으로 나눈다.
        String[] split = inputString.split("[.]");

        System.out.println(split[0]);
        System.out.println(split[1]);
    }
}
