package com.example.javaproject2.week4.day3;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        DrawDiamond drawDiamond = new DrawDiamond();
        drawDiamond.upStair(number);
        drawDiamond.downStair(number);
    }

    public void upStair(int number) {
        for (int i = 1; i <= number; i += 2) {
            makeALine(number, i);
        }
    }

    private void makeALine(int number, int i) {
        for (int j = 0; j < (number - i) / 2; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void downStair(int number) {
        for (int i = number - 2; i >= 1; i -= 2) {
            makeALine(number, i);
        }
    }
}
