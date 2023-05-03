package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1091 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int start = in.nextInt();
        long multi = in.nextLong();
        int sum = in.nextInt();
        int findNumber = in.nextInt();

        long result = start;

        for(int i = 1; i < findNumber; i++){
            result *= multi;
            result += sum;
        }
        System.out.println(result);
    }
}
