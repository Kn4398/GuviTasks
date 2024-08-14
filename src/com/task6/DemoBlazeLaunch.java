package com.task6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazeLaunch {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://www.google.com/");
            String pageTitle = driver.getTitle();
            if ("STORE".equals(pageTitle)) {
                System.out.println("Page landed on correct website");
            } else {
                System.out.println("Page not landed on correct website");
            }
        } finally {
            driver.quit();
        }
    }
}
