package com.example.javaproject2.week3.day4;

public class GetMax {
    public static void main(String[] args) {
        int[] arr = {4, 5, 13, 30, 1};
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("max : " + max);
    }
}
