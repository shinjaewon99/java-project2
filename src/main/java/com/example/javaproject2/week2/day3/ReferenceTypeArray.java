package com.example.javaproject2.week2.day3;

public class ReferenceTypeArray {
    public static void main(String[] args) {

        Student[] students = new Student[2];

        students[0] = new Student(); // 초기화를 꼭 해줘야된다 그렇지 않으면 null 값이 나옴
        students[0].name = "신재원";
        students[0].phoneNumber = "010-1234-5678";
        students[0].age = 25;

        // Object 타입은 모든 클래스의 부모 클래스
        Object obj = new Student();

    }
}
