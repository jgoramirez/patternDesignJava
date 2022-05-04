package com.jgoramirez.designpatterns.strategypattern.classes;

import com.jgoramirez.designpatterns.strategypattern.interfaces.BasicMath;

public class MultiplicationMath implements BasicMath {
    @Override
    public int solution(int number1, int number2) {
        return number1*number2;
    }

    @Override
    public String getOperation() {
        return "*";
    }
}
