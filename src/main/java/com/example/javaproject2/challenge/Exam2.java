package com.example.javaproject2.challenge;

public class Exam2 {
    class Solution {
        public int solution(int[] num_list) {
            int answer = 0;
            String total1 = ""; // 짝수 누적
            String total2 = ""; // 홀수 누적
            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] % 2 == 0) {
                    total1 += num_list[i];
                } else {
                    total2 += num_list[i];
                }
            }
            answer = Integer.parseInt(total1) + Integer.parseInt(total2);
            return answer;
        }
    }
}
