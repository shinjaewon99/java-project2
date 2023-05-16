package com.example.javaproject2.algorithm;

import java.util.Arrays;

public class BubbleSort {
    // private static final 상수 : 대문자로 명명
    private static final int[] NUMBERS = {35, 10, 50, 40, 20};

    // 정렬 메소드
    public int[] sortNumbers(int[] number, int loop) {
        for (int j = loop + 1; j < number.length; j++) {
            compareNumbers(loop, j);
        }
        return number;
    }

    // 비교 메소드
    public void compareNumbers(int loop1, int loop2) {
        if (NUMBERS[loop1] > NUMBERS[loop2]) {
            int temp = NUMBERS[loop1];
            NUMBERS[loop1] = NUMBERS[loop2];
            NUMBERS[loop2] = temp;
        }
    }

    // 반복 메소드
    public void loop(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            sortNumbers(numbers, i);
        }
        System.out.println(Arrays.toString(numbers));
    }

    // 호출과 생성만
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        sort.loop(NUMBERS);
    }
}
