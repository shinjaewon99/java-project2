package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1361 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        String star = "**";
        for(int i = 0; i < number; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println(star);
        }
    }
}
