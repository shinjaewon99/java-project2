package com.example.javaproject2.week5;

import java.util.EmptyStackException;

public class StackEx {
    private int[] arr = new int[10000];
    private int pointer = 0;


    // 값을 넣는 기능
    public void push(int num) {
        arr[pointer++] = num;
        System.out.println(pointer);
    }

    // 값을 하나 꺼내 확인하고 없애는 기능
    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        int temp = this.arr[pointer - 1];
        pointer--;
        return temp;
    }

    // 맨위의 값을 꺼내어 확인만 하는 기능
    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return this.arr[pointer - 1];
    }

    public boolean isEmpty() {
        return this.pointer == 0;
    }

    public static void main(String[] args) {
        StackEx stackEx = new StackEx();

        stackEx.push(10);
        stackEx.push(20);

        System.out.println(stackEx.pop());

        // 위 로직에서 pop을 한후 peek을 하였음으로, 10이 출력
        System.out.println(stackEx.peek());
    }
}
