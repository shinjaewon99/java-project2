package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int total = num1 + num2 + num3;
        System.out.println(total);

        System.out.printf("%.1f", (float) total / 3);
    }
}
