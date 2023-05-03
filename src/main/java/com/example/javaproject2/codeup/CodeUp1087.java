package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1087 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {

            sum += i;

            if (sum >= number) {
                System.out.println(sum);
                break;

            }
        }
    }
}
