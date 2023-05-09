package com.example.javaproject2.week4.day2;

public class Multiple {
    private int number;

    public Multiple(int number) {
        this.number = number;
    }
    public void print(int i){
        System.out.println(number + " * " + i + " = " + number * i);
    }

    public static void main(String[] args) {

        Multiple multiple = new Multiple(4);

        for (int i = 1; i <= 9; i++) {
            multiple.print(i);
        }
    }
}
