package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1049 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int check = in.nextInt();

        if(number > check){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
