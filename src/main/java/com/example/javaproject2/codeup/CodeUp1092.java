package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1092 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int aNumber = in.nextInt();
        int bNumber = in.nextInt();
        int cNumber = in.nextInt();

        int day = 1;

        while(day % aNumber != 0 || day % bNumber != 0 || day % cNumber != 0){
            day++;
        }

        System.out.println(day);

    }
}
