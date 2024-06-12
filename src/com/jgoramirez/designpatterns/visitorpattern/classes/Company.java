package com.jgoramirez.designpatterns.visitorpattern.classes;

public class Company extends Client {

    private final int nbrOfEmployees;

    public Company(String name, String address, String number, int nbrOfEmployees) {
        super(name, address, number);
        this.nbrOfEmployees = nbrOfEmployees;
    }
}
