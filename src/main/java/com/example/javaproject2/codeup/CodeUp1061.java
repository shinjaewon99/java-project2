package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1061 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputNumber1 = in.nextInt();
        int inputNumber2 = in.nextInt();

        // 비트 단위의 or 계산
        // 입력값 3 5
        // 00000011 00000101 비트가 or로 겹치는 연산
        System.out.println(inputNumber1 | inputNumber2);
    }
}
