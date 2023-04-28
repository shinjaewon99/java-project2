package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1122 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int second = in.nextInt();
        int minute = second / 60;


        System.out.printf("%d %d", minute, second % 60);
    }
}
