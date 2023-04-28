package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1067 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        if (number < 0) {
            System.out.println("minus");
        }else{
            System.out.println("plus");
        }

        if(number % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
