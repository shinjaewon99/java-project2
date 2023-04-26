package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1032 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        String converter = Integer.toHexString(number); // 입력값을 16진수로 변환

        System.out.println(converter);

    }
}
