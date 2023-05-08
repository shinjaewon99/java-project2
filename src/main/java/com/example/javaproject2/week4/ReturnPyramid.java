package com.example.javaproject2.week4;

import java.util.Scanner;

public class ReturnPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i - 1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
