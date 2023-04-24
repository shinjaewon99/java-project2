package com.example.javaproject2.week1.day5;

public class SpaceInvaderMemberVariable {

    int location; // 멤버 변수로 선언 (클래스의 멤버)

    public void moveLeft() {
        location = location - 1;
    }
    public void moveLeftPrint(){
        System.out.printf("moveLeft = %d", location);
    }

    public void moveRight() {
        location = location + 1;

    }

    public static void main(String[] args) {
        SpaceInvaderMemberVariable simv = new SpaceInvaderMemberVariable();
        simv.moveLeft();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();

        System.out.printf("최종 위치는 %d 입니다. \n", simv.location);
        simv.moveRight();
        System.out.printf("최종 위치는 %d 입니다. \n", simv.location);

    }
}
