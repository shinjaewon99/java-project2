package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1274 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        int count = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                count++;
            }
        }

        if(count == 2){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
