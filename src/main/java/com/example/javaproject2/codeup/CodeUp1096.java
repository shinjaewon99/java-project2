package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1096 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[][] graph = new int[19][19];


        for(int i = 0; i < size; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            graph[x - 1][y - 1] = 1;
        }

        for(int i = 0; i < 19; i++){
            for(int j = 0; j < 19; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
