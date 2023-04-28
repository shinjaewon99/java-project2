package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1124 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // C3H20
        // H를 기준으로 split하기 때문에
        // inputString[0] = C3, inputString[1] = 20 으로 반환됩니다.
        String[] inputString = in.nextLine().split("H");

        String inputStringSub = inputString[0].substring(1);


        System.out.println(12 * Integer.parseInt(inputStringSub) + Integer.parseInt(inputString[1]));


    }
}
