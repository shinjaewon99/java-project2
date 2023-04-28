package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1123 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        float result = (float) 9 / 5 * count + 32;
        System.out.printf("%.3f", result);
    }
}
