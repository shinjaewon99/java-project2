package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1064 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputNumber1 = in.nextInt();
        int inputNumber2 = in.nextInt();
        int inputNumber3 = in.nextInt();

        int min1 = inputNumber1 > inputNumber2 ? inputNumber2 : inputNumber1;
        int result = min1 > inputNumber3 ? inputNumber3 : min1;

        System.out.println(result);
    }
}
