package com.example.javaproject2.week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TrianglePrinter {

    private Printer printer;

    public TrianglePrinter(Printer printer) {
        this.printer = printer;
    }

    // system.out  --> console
    // BufferedWriter --> console, File

    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "", "*".repeat(i));
    }



    // 모양 출력하기
    public void printShape(int height) throws IOException {
        String[] lines = new String[height];
        for (int i = 0; i < height; i++) {
            lines[i] = makeALine(height, i + 1);
        }
        printer.print(lines);
    }

    public static void main(String[] args) throws IOException {

        TrianglePrinter tp = new TrianglePrinter(new FilePrinter());
        tp.printShape(5);
    }
}
