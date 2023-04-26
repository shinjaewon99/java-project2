package com.example.javaproject2.week2.day3;

public class RemainderSum {
    public static void main(String[] args) {

        int number = 687;
        int firstRemainder = number % 10;
        number /= 10;
        int secondRemainder = number % 10;
        number /= 10;
        int thirdRemainder = number % 10;

        System.out.println(firstRemainder + secondRemainder + thirdRemainder);
    }
}
