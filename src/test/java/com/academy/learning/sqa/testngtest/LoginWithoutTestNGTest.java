package com.academy.learning.sqa.testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class LoginWithoutTestNGTest extends BaseClass {

    public static void main(String[] args) {

        LoginWithoutMainMethod loginWithoutMainMethod = new LoginWithoutMainMethod();
        loginWithoutMainMethod.setUp();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(5)));
        WebElement userName = driver.findElement(By.cssSelector("input#txtUsername"));
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        WebElement loginButton = driver.findElement(By.cssSelector("input#btnLogin"));
        userName.sendKeys("Admin");
        password.sendKeys("admin123");
        loginButton.click();

        String actualHomePageTitle = driver.getTitle();
        System.out.println("Application login successfully");
        System.out.println("Home Page Title is: " + actualHomePageTitle);

        try {
            if (actualHomePageTitle.equals("OrangeHRM")) {
                System.out.println("Test Case passed");
            }

        } catch (Exception e) {
            System.out.println(" Home Page Title: " + actualHomePageTitle + "Not found");
        }

        driver.quit();

    }

    public void setUp() {
        String homeDirectory = System.getProperty("user.dir");
        System.out.println("home Directory is: " + " " + homeDirectory);
        String driverLocation = System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", driverLocation);
    }

    @Override
    protected String getTargetedPageTile() {
        return "OrangeHRM";
    }

}

