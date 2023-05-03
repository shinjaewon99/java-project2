package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1089 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int start = in.nextInt();
        int stack = in.nextInt();
        int findNumber = in.nextInt();

        int result = start;
        for (int i = 1; i < findNumber; i++) {
            result += stack;
        }
        System.out.println(result);
    }
}
