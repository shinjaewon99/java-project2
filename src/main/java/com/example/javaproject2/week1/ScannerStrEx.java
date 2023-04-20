package com.example.javaproject2.week1;

import java.util.Scanner;

public class ScannerStrEx {

    void inputStringAndPlus() {
        Scanner in = new Scanner(System.in);

        System.out.println("두개의 숫자를 입력하세요, 입력하고 엔터 입력하고 엔터를 해주세요");
        System.out.print("첫번째 숫자 : ");
        System.out.println("첫번째 숫자는" + in.nextInt());

        System.out.print("두번째 숫자 : ");
        System.out.println("두번째 숫자는" + in.nextInt());

    }
}
