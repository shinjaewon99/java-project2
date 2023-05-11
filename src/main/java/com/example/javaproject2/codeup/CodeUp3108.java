package com.example.javaproject2.codeup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String code;
    private String testId;
    private String name;

    public Student(String code, String testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}

public class CodeUp3108 {
    private List<Student> students = new ArrayList<>();

    private Student makeAStudent(String code, String testId, String name) {
        // new 연산자를 통해 Student 반환 (저장)
        return new Student(code, testId, name);
    }

    // 중복 검증
    private boolean isDuplicated(Student pStudent){
        // 중복 여부 check
        for(Student student : students){
            if(pStudent.getCode().equals(student.getCode())) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] splitString = "I 1011 한라산".split(" ");

        CodeUp3108 code = new CodeUp3108();

        // makeAStudent 메소드를 통해 값 저장 (할당)
        Student student = code.makeAStudent(splitString[0],splitString[1], splitString[2]);

        System.out.println(student.getCode());
    }
}
