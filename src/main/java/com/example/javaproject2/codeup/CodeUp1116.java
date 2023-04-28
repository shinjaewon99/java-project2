package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1116 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        int number2 = in.nextInt();

        System.out.printf("%d+%d=%d \n", number1, number2, number1 + number2);
        System.out.printf("%d-%d=%d \n", number1, number2, number1 - number2);
        System.out.printf("%d*%d=%d \n", number1, number2,number1 * number2);
        System.out.printf("%d/%d=%d \n", number1, number2,number1 / number2);

    }
}
