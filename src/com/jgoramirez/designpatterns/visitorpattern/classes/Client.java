package com.jgoramirez.designpatterns.visitorpattern.classes;

public abstract class Client {

    private final String name;
    private final String address;
    private final String number;

    protected Client(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

}
