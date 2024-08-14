package com.task6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaLaunch {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://www.wikipedia.org/");

            WebElement searchBox = driver.findElement(By.id("searchInput"));
            searchBox.sendKeys("Artificial Intelligence");
            searchBox.submit();

            WebElement historySection = driver.findElement(By.linkText("History"));
            historySection.click();

            String sectionTitle = driver.findElement(By.id("firstHeading")).getText();
            System.out.println("Section Title: " + sectionTitle);
        } finally {
            driver.quit();
        }
    }
}
