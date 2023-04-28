package com.example.javaproject2.week2.day3;

public class SwapEx {
    public static void main(String[] args) {


        // arr[1]과 arr[0]의 순서를 바꿔주세요
        int[] arr = {2, 1, 4, 6, 7};

        int temp = arr[1];

        arr[1] = arr[0];
        arr[0] = temp;

        for(int result : arr){
            System.out.print(result + " ");
        }

    }
}
