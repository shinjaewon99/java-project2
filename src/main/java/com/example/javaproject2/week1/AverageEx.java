package com.example.javaproject2.week1;

import java.util.Scanner;

public class AverageEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%.1f", (in.nextInt() + in.nextInt() + in.nextInt()) / 3.0);
    }
}
