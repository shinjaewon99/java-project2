package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class DefineArr3 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        int[] iArr = arr[0]; // 행 꺼내기
        iArr[0] = 2; // 꺼내진 행에 컬럼 값 할당하기
        iArr[2] = 1;

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

    }

}
