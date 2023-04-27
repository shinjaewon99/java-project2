package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1057 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean isCheck = in.nextInt() == in.nextInt();

        System.out.println(isCheck ? 1 : 0);

    }
}
