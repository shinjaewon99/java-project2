package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1120 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] iArr = new int[3];
        float sum = 0;
        for(int i = 0; i < iArr.length; i++){
            iArr[i] = in.nextInt();
            sum += iArr[i];
        }

        System.out.printf("%.2f", (sum / 3));

    }
}
