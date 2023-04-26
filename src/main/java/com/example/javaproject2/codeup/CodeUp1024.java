package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1024 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();

        for (int i = 0; i < inputString.length(); i++) {

            System.out.println("'" + inputString.charAt(i) + "'");
        }
    }
}
