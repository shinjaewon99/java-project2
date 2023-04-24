package com.example.javaproject2.week1.day4;

public class ByteTypeExercise {
    public static void main(String[] args) {
        byte byte1 = 127; // + 128이상은 담기지 않는다.
        byte byte2 = -128; // -129이하는 담기지 않는다.

        System.out.println("byte1 = " + byte1);
        System.out.println("byte2 = " + byte2);

    }
}
