package com.jgoramirez.designpatterns.visitorpattern.classes;

public class Restaurant extends Client {

    private final boolean availableAbroad;

    public Restaurant(String name, String address, String number, boolean availableAbroad) {
        super(name, address, number);
        this.availableAbroad = availableAbroad;
    }

}
