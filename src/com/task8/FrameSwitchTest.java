package com.task8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class FrameSwitchTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("http://the-internet.herokuapp.com/nested_frames");
            driver.switchTo().frame("frame-top");

            List<WebElement> topFrames = driver.findElements(By.cssSelector("frame"));
            if (topFrames.size() == 3) {
                System.out.println("Three frames are present in the top frame.");
            } else {
                System.out.println("Expected three frames, but found: " + topFrames.size());
                return; 
            }

            driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-left']")));
            String leftText = driver.findElement(By.xpath("//body")).getText();
            if ("LEFT".equals(leftText.trim())) {
                System.out.println("Left frame text verified: " + leftText);
            } else {
                System.out.println("Left frame text verification failed.");
            }

            driver.switchTo().parentFrame();
            driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
            String middleText = driver.findElement(By.xpath("//div")).getText();
            if ("MIDDLE".equals(middleText.trim())) {
                System.out.println("Middle frame text verified: " + middleText);
            } else {
                System.out.println("Middle frame text verification failed.");
            }

            driver.switchTo().parentFrame();
            driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-right']")));
            String rightText = driver.findElement(By.xpath("//body")).getText();
            if ("RIGHT".equals(rightText.trim())) {
                System.out.println("Right frame text verified: " + rightText);
            } else {
                System.out.println("Right frame text verification failed.");
            }

            driver.switchTo().parentFrame();
            driver.switchTo().defaultContent(); 
            driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-bottom']")));
            String bottomText = driver.findElement(By.xpath("//body")).getText();
            if ("BOTTOM".equals(bottomText.trim())) {
                System.out.println("Bottom frame text verified: " + bottomText);
            } else {
                System.out.println("Bottom frame text verification failed.");
            }

            driver.switchTo().defaultContent();
            String pageTitle = driver.getTitle();
            if ("Frames".equals(pageTitle)) {
                System.out.println("Page title verified: " + pageTitle);
            } else {
                System.out.println("Page title verification failed. Expected 'Frames' but found: " + pageTitle);
            }
        } finally {
            driver.quit();
        }
    }
}
