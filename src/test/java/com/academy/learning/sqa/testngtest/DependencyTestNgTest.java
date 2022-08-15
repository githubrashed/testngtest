package com.academy.learning.sqa.testngtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestNgTest {

    /*successful Dependency Test case in TestNG
    Make Assert.fail() to check dependsOnMethods methods are not executed
    run method forcefully by alwaysRun property e.g. alwaysRun = true*/

    @Test
    public void startCar() {
        System.out.println("Car Started");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"}, alwaysRun = false)
    public void driveCar() {
        System.out.println("Car Driving");
    }

    @Test(dependsOnMethods = {"startCar"})
    public void stopCar() {
        System.out.println("Car Stopped");
    }

    @Test(dependsOnMethods = {"startCar", "startCar"})
    public void parkCar() {
        System.out.println("Car parked");
    }

}
