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

    public void sort(int[] numbers, boolean isDesc) {
        if(isDesc){
            reverseSort(numbers);
        }
    }

    private void reverseSort(int[] numbers) {
        sort(numbers); // 오름차순으로 정렬을 먼저 해준다.
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
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

        sort.sort(numbers,true);
        System.out.println(Arrays.toString(numbers));

    }
}
