package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char inputString = in.next().charAt(0);

        for (char i = 'a'; i <= inputString; i++) {
            System.out.print(i + " ");
        }
    }
}
