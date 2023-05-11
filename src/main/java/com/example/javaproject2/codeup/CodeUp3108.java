package com.example.javaproject2.codeup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String code;
    private int testId;
    private String name;

    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}

public class CodeUp3108 {
    private List<Student> students = new ArrayList<>();

    private Student makeAStudent(String code, int testId, String name) {
        // new 연산자를 통해 Student 반환 (저장)
        return new Student(code, testId, name);
    }

    // 중복 검증
    private boolean isExists(Student pStudent) {
        // 중복 여부 check
        for (Student student : students) {
            if (pStudent.getCode() == (student.getCode())) return true;
        }
        return false;
    }

    public void addStudent(Student student) {
        // 중복이 아닐경우
        if (!isExists(student)) {
            students.add(student);
        }
    }

    public void deleteStudent(Student pStudent) {

        // isExists 메소드의 students 리스트를 검증하여 boolean값 반환
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getTestId() == (pStudent.getTestId())) students.remove(i);
        }
    }

    public void printStudent() {
        for (Student student : students) {
            System.out.printf("%s , %s , %s", student.getCode(), student.getTestId(), student.getName());
        }
    }

    public Student makeStudent(String inputStudent) {
        String[] splitString = inputStudent.split(" ");
        // makeAStudent 메소드를 통해 값 저장 (할당)

        return makeAStudent(splitString[0], Integer.parseInt(splitString[1]), splitString[2]);
    }

    public void process(String input) {
        Student student = makeStudent(input);
        // 파라미터로 들어온 student의 코드가 I일경우와 D일경우를 나눠서 반환
        switch (student.getCode()) {
            case "I" -> addStudent(student);
            case "D" -> deleteStudent(student);
        }
    }

    public void printStudent(int[] arr) {

        // 정렬
        Collections.sort(students,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getTestId() - o2.getTestId();
            }
        });


        // 출력
        for (int i = 0; i < arr.length; i++) {
            Student student = students.get(arr[i] - 1);
            System.out.printf("%s %s \n", student.getTestId(), student.getName());
        }
    }

    public static void main(String[] args) {
        CodeUp3108 code = new CodeUp3108();

        code.process("I 1011 한라산");
        code.process("I 999 백두산");
        code.process("I 999 오대산");
        code.process("D 999 백두산");
        code.process("I 800 백두산");
        code.process("D 500 한라산");
        code.process("I 900 남산");
        code.process("I 950 금강산");
        code.process("I 1205 지리산");
        code.process("I 700 북한산");
        code.printStudent(new int[]{1, 2, 4, 5, 6});

    }
}
