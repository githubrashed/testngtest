package com.academy.learning.sqa.testngtest;

import org.testng.annotations.Test;

public class TestClass {

    @Test(priority = 0)
    void setUp() {
        System.out.println("Test");
    }

    @Test(priority = 1)
    void doEatShouldSucceed() {
        System.out.println("I am eating rice");
    }

    @Test(priority = 3)
    void yestSteps() {
        System.out.println("Test Inside");
    }

    @Test(priority = 2)
    void meatDown() {
        System.out.println("Test Finished");
    }
}
