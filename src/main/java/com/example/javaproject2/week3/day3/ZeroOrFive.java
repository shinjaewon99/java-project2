package com.example.javaproject2.week3.day3;

public class ZeroOrFive {

    public static boolean isZeroOrFive(int number ){
        // 자릿수 만큼 반복하기
        while(number > 0){
            int remainder = number % 10;

            // 나머지가 0인 아닌경우
            if(remainder % 5 != 0){
                System.out.println("5의 배수가 아닙니다.");
                return false;
            }
            number /= 10;
        }
        System.out.println("5의 배수입니다.");
        return true;
    }
    public static void main(String[] args) {
        int num = 253;

        isZeroOrFive(num);

    }
}
