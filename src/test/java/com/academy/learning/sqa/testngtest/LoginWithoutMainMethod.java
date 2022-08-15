package com.academy.learning.sqa.testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginWithoutMainMethod extends BaseClass {

    @Test(priority = 0, enabled = true)
    public void verifyPageTitleInLoginPageShouldSucceed() {

        /*System.setProperty("webdriver.gecko.driver", "D:\\Others\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();*/

        driver.manage().window().maximize();
        driver.get(applicationUrl);
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));
        WebElement userName = driver.findElement(By.cssSelector("input#txtUsername"));
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        WebElement loginButton = driver.findElement(By.cssSelector("input#btnLogin"));
        userName.sendKeys(userForLogin);
        password.sendKeys(passForLogin);
        loginButton.click();
        System.out.println("Application login successfully");

        System.out.println(driver.getTitle());
        String expectedPageTitle = "OrangeHRM";
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
        System.out.println("Test Case no 2 passed");
        driver.quit();
    }

    @Override
    protected String getTargetedPageTile() {
        return "OrangeHRM";
    }

}
