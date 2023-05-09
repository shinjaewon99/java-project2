package com.example.javaproject2.week4.day2;

import java.util.Arrays;

public class CodeUp1098OOP {
    private int [][] graph;

    public CodeUp1098OOP(int rowCnt, int colCnt) {
        // new 연산자를 통해 파라미터로 넘어온 변수을 통해 2차원 배열을 생성한다.
        this.graph = new int[rowCnt][colCnt];
    }

    public void setGraph(int loop, int direction, int x, int y){

        for (int i = 0; i < loop; i++){

            if(direction == 0){ // 가로
                graph[x - 1][y - 1 + i] = 1;
            }else{ // 세로
                graph[x - 1 + i][y - 1] = 1;
            }
        }
    }

    public void print(){

        // graph의 길이 main에서 row : 5 col : 5 로 2차원 배열을 생성하였다.
        for (int i = 0; i < graph.length; i++) {
            System.out.println(Arrays.toString(graph[i]));
        }
    }

    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        CodeUp1098OOP c1098 = new CodeUp1098OOP(row, col);

        c1098.setGraph(2,0,1,1);
        c1098.print();
        c1098.setGraph(3, 1, 2, 3);
        c1098.print();

    }
}
