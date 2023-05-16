package com.example.javaproject2.algorithm;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] numbers = {50, 40, 10, 20, 60};

        for (int i = 0; i < numbers.length; i++) {
            int min = i;

            // 최소값 인덱스 찾기
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[min] > numbers[j]){
                    min = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = temp;

        }


        System.out.println(Arrays.toString(numbers));
    }
}
