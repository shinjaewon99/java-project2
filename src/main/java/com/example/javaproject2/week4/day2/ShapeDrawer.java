package com.example.javaproject2.week4.day2;

public abstract class ShapeDrawer {

    public void print(int height){

        for (int i = 0; i < height; i++) {
            System.out.println(makeALine(height, i));
        }
    }

    public abstract String makeALine(int h, int i);
}
