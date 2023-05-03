package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1086 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double wNumber = in.nextDouble();
        double hNumber = in.nextDouble();
        double bNumber = in.nextDouble();


        double result = (wNumber * hNumber * bNumber) / 8 / 1024 / 1024;

        System.out.printf("%.2f MB", result);
    }
}
