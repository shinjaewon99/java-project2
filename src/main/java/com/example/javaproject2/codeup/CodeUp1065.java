package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1065 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] iArr = new int[3];

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = in.nextInt();

            if (iArr[i] % 2 == 0) {
                System.out.println(iArr[i]);
            }
        }
    }
}
