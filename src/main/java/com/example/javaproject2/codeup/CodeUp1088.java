package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1088 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        for (int i = 1; i <= number; i++) {
            if(i % 3 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
