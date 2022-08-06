package com.academy.learning.sqa.testngtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupingTestNGTest {
    //include separate single group, multi group
    //exclude separate single group, multi group
//(groups = {"sanity"})
   // (groups = {"regression"})
    @Test(groups = {"sanity"})
    public void startCar() {
        System.out.println("Car Started");
    }

    @Test
    public void driveCar() {
        System.out.println("Car Driving");
    }

    @Test
    public void stopCar() {
        System.out.println("Car Stopped");
    }

    @Test
    public void parkCar() {
        System.out.println("Car parked");
    }
}
