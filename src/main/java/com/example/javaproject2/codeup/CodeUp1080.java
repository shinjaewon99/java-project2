package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1080 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int inputNumber = in.nextInt();

        int sum = 0;

        for(int i = 1; i <= inputNumber; i++){
            sum = sum + i;

            if(sum >= inputNumber){
                System.out.println(i);
                break;
            }
        }
    }
}
