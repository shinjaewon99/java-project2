package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1367 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        for(int i = 0; i < number; i++){
            // 공백은 Loop문 반복할수록 공백이 1만큼 줄어듬으로
            // j > i 로 조건을 작성해준다.
            for (int j = number - 1; j > i; j--) {
                System.out.print(" ");
            }

            for(int k = 0; k < number; k++){
                System.out.print("*");
            }
            // 한줄이 끝나면 줄 공백 처리
            System.out.println();
        }

    }
}
