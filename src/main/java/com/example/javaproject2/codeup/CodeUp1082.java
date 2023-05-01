package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1082 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String number1 = in.next();

        int hex = Integer.parseInt(number1, 16);

        for (int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\n", hex, i, i * hex);
        }
    }
}
