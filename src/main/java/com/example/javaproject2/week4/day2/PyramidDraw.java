package com.example.javaproject2.week4.day2;

public class PyramidDraw extends ShapeDrawer{
    @Override
    public String makeALine(int h, int i) {

        return String.format(" ".repeat(i) + "*".repeat(2 * (h - i) - 1));
    }


    public static void main(String[] args) {
        ShapeDrawer pyramidDraw = new PyramidDraw();
        pyramidDraw.print(4);
    }

}
