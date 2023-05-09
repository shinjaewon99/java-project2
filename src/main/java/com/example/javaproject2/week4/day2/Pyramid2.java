package com.example.javaproject2.week4.day2;

public class Pyramid2 {
    private String space;
    private int height;

    public Pyramid2(String space, int height) {
        this.space = space;
        this.height = height;
    }

    public String makeALine(int i) {
        return String.format(space.repeat(height - i + 1) + "*".repeat(2 * i + 1));
    }

    public void print() {
        for (int i = 0; i < height; i++) {
            System.out.println(makeALine(i));
        }
    }

    public static void main(String[] args) {
        Pyramid2 pyramid2 = new Pyramid2(" ", 4);
        pyramid2.print();
    }
}
