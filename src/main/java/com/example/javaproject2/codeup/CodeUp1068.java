package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        if(number >= 90){
            System.out.println("A");
        } else if (number >= 70) {
            System.out.println("B");
        } else if (number >= 40) {
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
}
