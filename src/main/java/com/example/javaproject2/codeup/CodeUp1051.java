package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1051 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int check = in.nextInt();

        System.out.println(check >= number ? 1 : 0);
    }
}
