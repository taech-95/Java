package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;


    public VipCustomer(){
        this("Mykola",1000.00,"mykola@gmail.com");
    }
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"mykola@gmail.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
