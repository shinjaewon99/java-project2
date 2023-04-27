package com.example.javaproject2.week2.day4;

public class Accumulate687While {
    public static void main(String[] args) {

        // 변수, 누적, 연산자, 나머지, 몫
        int num = 687;
        int result = 0;

        // num이 0보다 작을때 까지 Loop(반복)
        while(num > 0){
            result = result + (num % 10);
            num = num / 10;

            System.out.printf("num : %d, result : %d\n", num, result);
        }
        
    }
}
