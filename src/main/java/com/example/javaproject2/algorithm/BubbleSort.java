package com.example.javaproject2.algorithm;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {50, 40, 20, 30, 10};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
