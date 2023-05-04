package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1097 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] graph = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                graph[i][j] = in.nextInt();
            }
        }

        // 뒤집는 횟수
        int change = in.nextInt();

        // 10 10
        // 12 12
        for (int i = 0; i < change; i++) {
            // 0번 인덱스부터 시작함으로 -1
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;

            // 0이면 1로, 1이면 0으로 바꿔준다. 행과 열이 겹치는 부분이 1로 반환된다.
            for (int j = 0; j < graph.length; j++) {
                if (graph[x][j] == 0) {
                    graph[x][j] = 1;
                } else {
                    graph[x][j] = 0;
                }
            }

            for (int j = 0; j < graph.length; j++) {
                if (graph[j][y] == 0) {
                    graph[j][y] = 1;
                } else {
                    graph[j][y] = 0;
                }
            }
        }


        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }


    }
}
