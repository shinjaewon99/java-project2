package com.example.javaproject2.week1.day5;

public class PointTest {

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 1;
        p1.y = 2;

        System.out.printf("x:%d, y:%d\n", p1.x, p1.y);
        System.out.printf("x와 y가 같나요? : %s\n", p1.isSameXy());

        Point p2 = new Point();
        p2.x = 1;
        p2.y = 1;
        System.out.printf("x:%d, y:%d\n", p2.x, p2.y);
        System.out.printf("x와 y가 같나요? : %s\n", p2.isSameXy());



    }
}
