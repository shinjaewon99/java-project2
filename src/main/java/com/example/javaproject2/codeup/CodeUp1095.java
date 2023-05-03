package com.example.javaproject2.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1095 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] total = new int[size];

        for(int i = 0; i < size; i++){
            total[i] = in.nextInt();
        }

        Arrays.sort(total);

        System.out.println(total[0]);
    }
}
