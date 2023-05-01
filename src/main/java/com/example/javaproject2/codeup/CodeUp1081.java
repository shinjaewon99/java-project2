package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1081 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        int number2 = in.nextInt();

        for(int i = 1; i <= number1; i++){
            for(int j = 1; j <= number2; j++){
                System.out.printf("%d %d\n", i, j);
            }
        }
    }
}
