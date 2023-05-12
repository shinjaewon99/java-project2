package com.example.javaproject2.week4.day5;

public class Hospital {
    private String name;
    private String websiteArr;
    private Address address;

    public Hospital(String name, String websiteArr, Address address) {
        this.name = name;
        this.websiteArr = websiteArr;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getWebsiteArr() {
        return websiteArr;
    }

    public Address getAddress() {
        return address;
    }
}
