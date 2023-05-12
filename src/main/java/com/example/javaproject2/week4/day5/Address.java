package com.example.javaproject2.week4.day5;

public class Address {

    private String fullAddress;
    private String sido; // ~시 ~도
    private String sigungou; // ~시군구

    public Address(String fullAddress, String sido, String sigungou) {
        this.fullAddress = fullAddress;
        this.sido = sido;
        this.sigungou = sigungou;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public String getSido() {
        return sido;
    }

    public String getSigungou() {
        return sigungou;
    }
}
