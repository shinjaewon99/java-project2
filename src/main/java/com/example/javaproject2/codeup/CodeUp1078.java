package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1078 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputNumber = in.nextInt();

        int sum = 0;
        for (int i = 0; i <= inputNumber; i++) {
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
