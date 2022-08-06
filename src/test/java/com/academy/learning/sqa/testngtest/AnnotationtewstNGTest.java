package com.academy.learning.sqa.testngtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class AnnotationtewstNGTest {
    @BeforeSuite
    void beforeSuite()
    {
        System.out.println("beforeSuite");
    }
    @BeforeClass
    void beforeClass()
    {
        System.out.println("beforeClass");
    }
    @BeforeTest
    void beforeTest()
    {
        System.out.println("beforeTest");
    }

    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("beforeMethod");

    }

    @Test
    void test1(){
        System.out.println("test1");
    }
    @AfterMethod
    void aftereMethod()
    {
        System.out.println("afterMethod");
    }


    @Test
    void test2(){
        System.out.println("test2");
    }
    @AfterTest
    void afterTest()
    {
        System.out.println("afterTest");
    }
    @AfterClass
    void afterClass()
    {
        System.out.println("afterClass");
    }
    @AfterSuite
    void AfterSuite()
    {
        System.out.println("afterSuite");
    }
}
