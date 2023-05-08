package com.example.javaproject2.week4;

import java.util.Scanner;

public class ReturnStar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        for(int i = 1; i <= number; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
