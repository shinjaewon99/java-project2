package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1085 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double hNumber = in.nextDouble();
        double bNumber = in.nextDouble();
        double cNumber = in.nextDouble();
        double sNumber = in.nextDouble();


        double result = (hNumber * bNumber * cNumber * sNumber) / 8 / 1024 / 1024;

        System.out.printf("%.1f MB", result);
    }
}
