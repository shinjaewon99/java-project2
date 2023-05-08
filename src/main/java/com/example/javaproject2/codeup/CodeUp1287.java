package com.example.javaproject2.codeup;

import java.util.Scanner;
public class CodeUp1287 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        for(int i = 1; i <= 9; i++){
            // number의 배수만큼 "*"을 출력한다.
            for(int j = 0; j < i * number; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
