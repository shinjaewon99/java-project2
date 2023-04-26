package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1035 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String number = in.next();

        int temp = Integer.parseInt(number, 16);  // 16진수로 바꾸고 변수에 담아준다.

        String result = Integer.toOctalString(temp); // 변수 temp의 값을 8진수로 변환해준다.

        System.out.println(result);
    }
}
