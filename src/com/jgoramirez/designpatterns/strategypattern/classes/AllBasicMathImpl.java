package com.jgoramirez.designpatterns.strategypattern.classes;

import com.jgoramirez.designpatterns.strategypattern.interfaces.BasicMath;

import java.util.List;
import java.util.Optional;

public class AllBasicMathImpl {

    public Integer operations(List<BasicMath> listOperations, int number1, int number2, String operation) {
        Integer results = 0;

        Optional<BasicMath> firstResult = listOperations.stream()
                .filter(basicMathE -> basicMathE.getOperation().startsWith(operation))
                .findFirst();
        if (firstResult.isPresent()) {
            results = firstResult.get().solution(number1, number2);
        } else {
            throw new IllegalStateException("Operation is not defined");
        }

        return results;

    }

}
