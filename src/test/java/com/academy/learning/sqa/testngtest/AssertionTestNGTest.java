package com.academy.learning.sqa.testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTestNGTest extends BaseClass {
    @Test
    public void verifyPageTitleInLoginPageShouldSucceed() {
        /*System.setProperty("webdriver.gecko.driver", "D:\\Others\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();*/

        driver.manage().window().maximize();
        driver.get(applicationUrl);
        WebElement userName = driver.findElement(By.cssSelector("input#txtUsername"));
        Assert.assertTrue(userName.isDisplayed());
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        WebElement loginButton = driver.findElement(By.cssSelector("input#btnLogin"));
        userName.sendKeys(userForLogin);
        password.sendKeys(passForLogin);
        loginButton.click();
        System.out.println("Application login successfully");
        System.out.println(driver.getTitle());
        String expectedPageTitle = "OrangeHRM";
       // OrangeHRM
//        String expectedPageTitle = getTargetedPageTile();
        System.out.println("Expected Title is: " + expectedPageTitle);
        String actualPageTitle = driver.getTitle();
        System.out.println("actualPageTitle: " +actualPageTitle );
        Assert.assertEquals(actualPageTitle,expectedPageTitle);
//        Assert.assertEquals(expectedPageTitle, actualPageTitle);
        Assert.assertTrue(expectedPageTitle.contains(expectedPageTitle));
//        Assert.assertTrue(actualPageTitle.contains("OrangeHRM"));
//        Assert.assertFalse(actualPageTitle.contains("OrangeHRM"));
        System.out.println("Test Case no 2 passed");
        driver.quit();
    }

    @Override
    protected String getTargetedPageTile() {
        return "OrangeHRM";
    }
}
