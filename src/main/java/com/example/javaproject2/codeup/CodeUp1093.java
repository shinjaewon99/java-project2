package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1093 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int[] result = new int[24];

        for(int i = 0; i < number; i++){
            int random = in.nextInt();

            // 인덱스값 증가
            result[random]++;
        }

        for(int i = 1; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
