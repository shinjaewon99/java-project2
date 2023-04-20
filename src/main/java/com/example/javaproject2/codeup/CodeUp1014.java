package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char inputChar1 = in.next().charAt(0);
        char inputChar2 = in.next().charAt(0);

        char temp = inputChar1;
        inputChar1 = inputChar2;
        inputChar2 = temp;

        System.out.println(inputChar1 + " " + inputChar2);
    }
}
