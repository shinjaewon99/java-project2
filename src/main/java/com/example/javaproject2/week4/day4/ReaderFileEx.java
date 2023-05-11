package com.example.javaproject2.week4.day4;

import java.io.*;

public class ReaderFileEx {
    public String[] read(){
        return new String[5];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\tlswo\\OneDrive\\바탕 화면\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9\\1.병원정보서비스 2022.10..csv"));

        System.out.println(br.readLine());
    }
}
