package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1069 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();

        switch (name) {
            case "A":
                System.out.println("best!!!");
                break;
            case "B":
                System.out.println("good!!");
                break;
            case "C":
                System.out.println("run!");
                break;
            case "D":
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
        }
    }
}
