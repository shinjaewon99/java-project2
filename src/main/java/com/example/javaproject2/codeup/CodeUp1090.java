package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1090 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long start = in.nextLong();
        long stack = in.nextLong();
        long findNumber = in.nextLong();

        long result = start;

        for (int i = 1; i < findNumber; i++) {

            result *= stack;
        }
        System.out.println(result);
    }
}
