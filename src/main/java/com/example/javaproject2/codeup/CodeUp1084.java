package com.example.javaproject2.codeup;

import java.io.*;

public class CodeUp1084 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        // 2 2 2를 split 으로 받음
        String[] s = br.readLine().split(" ");

        int count = 0;
        for (int i = 0; i < Integer.parseInt(s[0]); i++) {
            for (int j = 0; j < Integer.parseInt(s[1]); j++) {
                for (int k = 0; k < Integer.parseInt(s[2]); k++) {
                    bw.write(i + " " + j + " " + k + "\n");
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}