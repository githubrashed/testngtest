package com.academy.learning.sqa.testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class OptimizeLoginWithTestNGTest extends BaseClass {

    @Test(priority = 0, enabled = true)
    public void loginWithValidUserPasswordShouldSucceed() {

        driver.get(applicationUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(5)));
        WebElement userName = driver.findElement(By.cssSelector("input#txtUsername"));
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        WebElement loginButton = driver.findElement(By.cssSelector("input#btnLogin"));
        userName.sendKeys(userForLogin);
        password.sendKeys(passForLogin);
        loginButton.click();
        System.out.println("Application login successfully");
        System.out.println(driver.getTitle());
        System.out.println("Test Case  passed");
    }

    @Override
    protected String getTargetedPageTile() {
        return "OrangeHRM";
    }

}
