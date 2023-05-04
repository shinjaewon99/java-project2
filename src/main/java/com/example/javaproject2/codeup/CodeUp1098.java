package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1098 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int xSize = in.nextInt();
        int ySize = in.nextInt();
        int[][] board = new int[xSize][ySize];
        int stick = in.nextInt();

        for (int i = 0; i < stick; i++) {
            int length = in.nextInt(); // 길이
            int dir = in.nextInt(); // 방향
            int xComma = in.nextInt(); // x좌표
            int yComma = in.nextInt(); // y좌표

            for (int j = 0; j < length; j++) {
                // 방향이 0일경우 길이 만큼 가로로 찍는다.
                if (dir == 0) {
                    board[xComma - 1][yComma - 1 + j] = 1;
                }
                // 0이 아닐경우는 길이 만큼 세로로 찍는다.
                else {
                    board[xComma - 1 + j][yComma - 1] = 1;
                }
            }

        }

        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
