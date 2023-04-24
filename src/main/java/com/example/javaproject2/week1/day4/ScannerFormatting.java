package com.example.javaproject2.week1.day4;

import java.util.Scanner;

public class ScannerFormatting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int val1 = in.nextInt();
        int val2 = in.nextInt();

        System.out.printf("%d와 %d의 합은 %d입니다", val1, val2, val1 + val2);
    }
}
