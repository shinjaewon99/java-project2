package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1029 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 범위에 따라 타입 지정
        double inputNumber = in.nextDouble();

        // 소수 11자리로맞추기 위해
        System.out.printf("%.11f",inputNumber);
    }
}
