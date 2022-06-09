package com.academy.learning.sqa.testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginWithMainMethlod extends BaseClass {
    public static void main(String[] args) {
//        String homeDirectory = System.getProperty("user.dir");
//        System.out.println("home Directory is: " + " "  + homeDirectory);
//        System.setProperty("webdriver.gecko.driver", "D:\\Others\\Driver\\geckodriver.exe");
        /*String driverLocation = System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", driverLocation);
//        System.setProperty("webdriver.gecko.driver", "D:\\Others\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();*/
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.cssSelector("input#txtUsername"));
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        WebElement loginButton = driver.findElement(By.cssSelector("input#btnLogin"));
        userName.sendKeys("Admin");
        password.sendKeys("admin123");
        loginButton.click();
        System.out.println("Application login successfully");
        System.out.println(driver.getTitle());
        System.out.println("Test Case passed");
    }

    @Override
    protected String getTargetedPageTile() {
        return "OrangeHRM";
    }
}
