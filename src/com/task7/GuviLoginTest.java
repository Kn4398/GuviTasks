package com.task7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GuviLoginTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.guvi.in/");
            driver.manage().window().maximize();

            WebElement signupButton = driver.findElement(By.linkText("Sign up"));
            signupButton.click();

            WebElement nameField = driver.findElement(By.id("name"));
            WebElement emailField = driver.findElement(By.id("email"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement mobileNumberField = driver.findElement(By.id("mobileNumber"));
            WebElement signupSubmitButton = driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));

            nameField.sendKeys("Test User");
            emailField.sendKeys("testuser@example.com");
            passwordField.sendKeys("password123");
            mobileNumberField.sendKeys("1234567890");
            signupSubmitButton.click();

            String registrationSuccessTitle = driver.getTitle();
            if (registrationSuccessTitle.contains("GUVI")) {
                System.out.println("User registered successfully.");
            } else {
                System.out.println("Registration failed.");
                return; 
            }

            WebElement loginButton = driver.findElement(By.linkText("Login"));
            loginButton.click();

            WebElement loginEmailField = driver.findElement(By.id("email"));
            WebElement loginPasswordField = driver.findElement(By.id("password"));
            WebElement loginSubmitButton = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));

            loginEmailField.sendKeys("testuser@example.com");
            loginPasswordField.sendKeys("password123");
            loginSubmitButton.click();

            String loginSuccessTitle = driver.getTitle();
            if (loginSuccessTitle.contains("GUVI")) {
                System.out.println("User logged in successfully.");
            } else {
                System.out.println("Login failed.");
            }
        } finally {
            driver.quit();
        }
    }
}
