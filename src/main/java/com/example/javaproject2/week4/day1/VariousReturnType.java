package com.example.javaproject2.week4.day1;

public class VariousReturnType {

    public boolean isAdult() {
        return true;
    }

    public int plus() {
        return 1 + 1;
    }

    public void print(){
        System.out.println("Hello");
    }


    public static void main(String[] args) {
        VariousReturnType type = new VariousReturnType();
        type.isAdult();
        type.plus();
        type.print();
    }
}

