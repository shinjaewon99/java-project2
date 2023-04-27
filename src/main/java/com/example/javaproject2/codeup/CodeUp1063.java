package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1063 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputNumber1 = in.nextInt();
        int inputNumber2 = in.nextInt();

        System.out.println(inputNumber1 < inputNumber2 ? inputNumber2 : inputNumber1);
    }
}
