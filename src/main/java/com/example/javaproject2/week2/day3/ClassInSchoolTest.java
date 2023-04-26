package com.example.javaproject2.week2.day3;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no = 1;
        classInSchool.teacher = new Teacher(); // 인스턴스화 시켜줘야된다. 클래스 안에 클래스임으로
        classInSchool.teacher.name = "신재원";
        classInSchool.teacher.age = 25;
        classInSchool.students = new Student[30];


        System.out.println(classInSchool.teacher.name);
        System.out.printf("선생님의 이름은 %s이고 나이는 %d 입니다.", classInSchool.teacher.name, classInSchool.teacher.age);

    }
}
