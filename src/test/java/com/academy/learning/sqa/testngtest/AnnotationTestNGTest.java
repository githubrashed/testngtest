package com.academy.learning.sqa.testngtest;

import org.testng.annotations.*;

public class AnnotationTestNGTest {

    @BeforeSuite
    void beforeSuite() {
        System.out.println("beforeSuite");
    }

    @BeforeClass
    void beforeClass() {
        System.out.println("beforeClass");
    }

    @BeforeTest
    void beforeTest() {
        System.out.println("beforeTest");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("beforeMethod");
    }

    @Test
    void testOne() {
        System.out.println("testOne");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("afterMethod");
    }

    @Test
    void testTwo() {
        System.out.println("testTwo");
    }

    @AfterTest
    void afterTest() {
        System.out.println("afterTest");
    }

    @AfterClass
    void afterClass() {
        System.out.println("afterClass");
    }

    @AfterSuite
    void AfterSuite() {
        System.out.println("afterSuite");
    }

}
