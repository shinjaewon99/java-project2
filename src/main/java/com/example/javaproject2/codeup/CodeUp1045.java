package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1045 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int leftNumber = in.nextInt();
        int rightNumber = in.nextInt();

        System.out.println(leftNumber + rightNumber);
        System.out.println(leftNumber - rightNumber);
        System.out.println(leftNumber * rightNumber);
        System.out.println(leftNumber / rightNumber);
        System.out.println(leftNumber % rightNumber);
        System.out.printf("%.2f",  (float) leftNumber / (float) rightNumber);

    }
}
