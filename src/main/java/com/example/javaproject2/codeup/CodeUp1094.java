package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1094 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] total = new int[size];
        for (int i = 0; i < size; i++) {
            total[i] = in.nextInt();
        }


        for (int i = total.length - 1; i >= 0; i--) {
            System.out.print(total[i] + " ");
        }
    }
}
