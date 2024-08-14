package com.task6;
  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLaunch {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        try {
            driver.manage().window().maximize();
            driver.get("http://google.com");
            System.out.println("Current URL: " + driver.getCurrentUrl());
            driver.navigate().refresh();
        } finally {
            driver.quit();
        }
    }
}
