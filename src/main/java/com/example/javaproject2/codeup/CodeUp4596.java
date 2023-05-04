package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp4596 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = 0, row = 0, col = 0;


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int number = in.nextInt();

                if (number > max) {
                    max = number;
                    row = i + 1; // 열
                    col = j + 1; // 행
                }
            }
        }

        System.out.println(max);
        System.out.print(row + " " + col);

    }
}
