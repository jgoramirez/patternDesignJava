package com.jgoramirez.designpatterns.strategypattern.test;

import com.jgoramirez.designpatterns.strategypattern.classes.AdditionMath;
import com.jgoramirez.designpatterns.strategypattern.classes.AllBasicMathImpl;
import com.jgoramirez.designpatterns.strategypattern.classes.MultiplicationMath;
import com.jgoramirez.designpatterns.strategypattern.classes.SubstractionMath;
import com.jgoramirez.designpatterns.strategypattern.interfaces.BasicMath;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllBasicMathImplTest {

    private AllBasicMathImpl allBasicMath;
    private List<BasicMath> basicMaths;

    @BeforeEach
    void setUp() {
        allBasicMath = new AllBasicMathImpl();
        basicMaths = new ArrayList<>();
        basicMaths.add(new AdditionMath());
        basicMaths.add(new MultiplicationMath());
        basicMaths.add(new SubstractionMath());
    }

    @Test
    void additionTest1() {

        //for setUp and ...
        int number1 = 3;
        int number2 = 4;
        int expectedResult = 7;
        String operation = "+";

        //Then
        assertEquals(
                expectedResult,
                allBasicMath.operations(basicMaths, number1, number2, operation)
        );

    }

    @Test
    void additionTest2() {

        //for setUp and ...
        int number1 = 99;
        int number2 = 1;
        int expectedResult = 100;
        String operation = "+";

        //Then
        assertEquals(
                expectedResult,
                allBasicMath.operations(basicMaths, number1, number2, operation)
        );

    }

    @Test
    void subtractionTest1() {

        //for setUp and ...
        int number1 = 3;
        int number2 = 4;
        int expectedResult = -1;
        String operation = "-";

        //Then
        assertEquals(
                expectedResult,
                allBasicMath.operations(basicMaths, number1, number2, operation)
        );

    }

    @Test
    void subtractionTest2() {

        //for setUp and ...
        int number1 = 100;
        int number2 = 1;
        int expectedResult = 99;
        String operation = "-";

        //Then
        assertEquals(
                expectedResult,
                allBasicMath.operations(basicMaths, number1, number2, operation)
        );

    }

    @Test
    void multiplicationTest1() {

        //for setUp and ...
        int number1 = 3;
        int number2 = 4;
        int expectedResult = 12;
        String operation = "*";

        //Then
        assertEquals(
                expectedResult,
                allBasicMath.operations(basicMaths, number1, number2, operation)
        );

    }

    @Test
    void multiplicationTest2() {

        //for setUp and ...
        int number1 = 12;
        int number2 = 12;
        int expectedResult = 144;
        String operation = "*";

        //Then
        assertEquals(
                expectedResult,
                allBasicMath.operations(basicMaths, number1, number2, operation)
        );

    }

    @Test
    void exceptionTest1() {

        //for setUp and ...
        int number1 = 2;
        int number2 = 4;
        String operation = "Sqr";
        String expectedExceptionMessage = "Operation is not defined";

        //Then
        Throwable throwable = assertThrowsExactly(IllegalStateException.class, () -> {
            allBasicMath.operations(basicMaths, number1, number2, operation);
        });


        assertEquals(expectedExceptionMessage, throwable.getMessage());

    }

    @Test
    void exceptionTest2() {

        //for setUp and ...
        int number1 = 3;
        int number2 = 9;
        String operation = "POW";
        String expectedExceptionMessage = "Operation is not defined";

        //Then
        Throwable throwable = assertThrowsExactly(IllegalStateException.class, () -> {
            allBasicMath.operations(basicMaths, number1, number2, operation);
        });


        assertEquals(expectedExceptionMessage, throwable.getMessage());

    }

}