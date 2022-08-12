package com.academy.learning.sqa.testngtest;

import org.testng.annotations.Test;

public class PriorityTestNGTest {

    @Test(priority = 2)
    public void loginShouldSucceed() {
        System.out.println("Login successfully");
    }

    @Test(priority = 1, enabled = true)
    public void setUp() {
        System.out.println("Opening Browser");
    }

    @Test(priority = 3)
    public void logOut() {
        System.out.println("logOut");
    }

    @Test(priority = 4)
    public void closeBrowser() {
        System.out.println("Closing Browser");
    }

}
