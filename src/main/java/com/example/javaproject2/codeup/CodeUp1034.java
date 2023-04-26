package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1034 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String number = in.next();

        int temp = Integer.parseInt(number, 8); // 8진수로 입력된 문자열을 10진수로 변환
        System.out.println(temp);
    }
}
