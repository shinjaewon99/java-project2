package com.example.javaproject2.algorithm;

import java.util.Arrays;

public class BubbleSort {
    private static int[] arr = {50, 40, 20, 30, 10};


    public int[] sort(int[] arr, int loop){
        for (int j = loop + 1; j < arr.length; j++) {
            if (arr[loop] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[loop];
                arr[loop] = temp;
            }
        }
        return arr;
    }

    public void loop(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            sort(arr, i);
        }
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        sort.loop(arr);
        System.out.println(Arrays.toString(arr));
    }
}
