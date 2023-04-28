package com.example.javaproject2.week2.day5;

public class IfWithLogicalOperator {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        if (x > 0 && y > 0) {
            System.out.println("x와 y는 모두 양수입니다.");
        }

        if (x > 0 || y > 0) {
            System.out.println("x와 y 적어도 둘중 한개는 양수입니다.");
        }


        if (!(x > 0)) {
            System.out.println("x는 음수입니다.");
        }
    }
}
