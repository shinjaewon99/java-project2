package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1058 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputNumber1 = in.nextInt();
        int inputNumber2 = in.nextInt();

        if (inputNumber1 == 0 && inputNumber2 == 0) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}