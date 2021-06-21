package com.testinium.project;

public class Musteri {
    private String identityNumber;
    private String name;
    private double balance;

    public Musteri() {
    }

    public Musteri(String identityNumber, String name, double balance) {
        this.identityNumber = identityNumber;
        this.name = name;
        this.balance = balance;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
