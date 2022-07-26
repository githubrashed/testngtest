package com.academy.learning.sqa.testngtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseClass {
    protected abstract String getTargetedPageTile();
    public String applicationUrl = "https://opensource-demo.orangehrmlive.com/";
    public String userForLogin = "Admin";
    public String passForLogin = "admin123";
    protected static WebDriver driver;
//    String property;

    @BeforeClass
    public void setUp() {
        String homeDirectory = System.getProperty("user.dir");
        System.out.println(homeDirectory);
//        System.setProperty("webdriver.gecko.driver", "D:\\Others\\Driver\\geckodriver.exe");
        String driverLocation = System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", driverLocation);
//        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\webDriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));
//        PageFactory.initElements(driver, this);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
