package com.example.javaproject2.week4.day2;

public class ReversePyramid {

    private int height;
    private String space;

    public ReversePyramid(int height, String space) {
        this.height = height;
        this.space = space;
    }
    public String makeALine(int i){
        return String.format(space.repeat(i) + "*".repeat(2 * (height - i) - 1));
    }

    public void print(){
        for (int i = 0; i < height; i++) {
            System.out.println(makeALine(i));
        }
    }
    public static void main(String[] args) {

        ReversePyramid reversePyramid = new ReversePyramid(4, " ");
        reversePyramid.print();
    }
}
