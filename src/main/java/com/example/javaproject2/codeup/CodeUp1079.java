package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1079 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String[] inputString = in.next().split("");

            if (inputString[inputString.length - 1].equals("q")) {
                System.out.println(inputString[inputString.length - 1]);
                break;
            }
            System.out.println(inputString[inputString.length - 1]);
        }
    }
}

