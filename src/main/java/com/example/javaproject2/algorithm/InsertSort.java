package com.example.javaproject2.algorithm;

import java.util.Arrays;

public class InsertSort {
    public void sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int pivot = numbers[i];
            int j = i - 1;
            shiftNumber(numbers, pivot, j);
        }
    }

    public void shiftNumber(int[] numbers, int pivot, int j) {
        while (j >= 0 && numbers[j] > pivot) {
            numbers[j + 1] = numbers[j];
            j--;
        }
        numbers[j + 1] = pivot;
    }


    public static void main(String[] args) {
        InsertSort sort = new InsertSort();
        int[] numbers = {50, 40, 10, 20, 60};

        sort.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
