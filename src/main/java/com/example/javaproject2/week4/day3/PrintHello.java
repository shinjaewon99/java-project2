package com.example.javaproject2.week4.day3;

public class PrintHello {
    private Hello hello;

    public PrintHello(Hello hello) {
        this.hello = hello;
    }



    public void loop (int i, String message){
        for (int j = 0; j < i; j++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {

        PrintHello printHello = new PrintHello(new ConsoleHello());
        printHello.loop(5, "hello");
    }
}
