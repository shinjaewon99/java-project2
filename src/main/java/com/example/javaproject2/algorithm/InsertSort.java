package com.example.javaproject2.algorithm;

import java.util.Arrays;

public class InsertSort {

    // 오름차순 기능
    public void sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int pivot = numbers[i];
            int j = i - 1;
            shiftNumber(numbers, pivot, j);
        }
    }

    // 내림차순 기능 (오버로딩)
    public void sort(int[] numbers, boolean isDesc) {
        if (isDesc) {
            reverseSort(numbers);
        }
    }

    // 내림차순 기능
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

    // 배열의 값 이동 기능
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

        // 오름차순 출력
        sort.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // 내림차순 출력
        sort.sort(numbers, true);
        System.out.println(Arrays.toString(numbers));

    }
}
