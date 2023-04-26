package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1031 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputNumber = in.nextInt();

        StringBuilder sb = new StringBuilder();

        // 8진수로 만들기
        while (inputNumber >= 1) {
            sb.append(inputNumber % 8);
            inputNumber /= 8;
        }

        // reverse : 뒤집는 메서드
        StringBuilder reverse = sb.reverse();

        System.out.println(reverse.toString());
    }
}
