package com.example.javaproject2.week4.day1;

public class UserFactoryTest {
    public static void main(String[] args) {

        UserFactory user = new UserFactory();
        User adultUser = user.getAdultUser();

        boolean adult = adultUser.isAdult();
        System.out.println(adult);
    }
}
