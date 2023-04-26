package com.example.javaproject2.week2.day3;

public class LikeAccumulate {
    public static void main(String[] args) {
        int likeCount = 0;
        likeCount += 1;
        System.out.println("likeCount = " + likeCount);
        likeCount += 1;
        System.out.println("likeCount = " + likeCount);
        likeCount += 1;
        System.out.println("likeCount = " + likeCount);


        int bank = 1_000_000;
        bank -= 500_000;
        System.out.println("bank = " + bank);
        bank += 100_000;
        System.out.println("bank = " + bank);
    }
}
