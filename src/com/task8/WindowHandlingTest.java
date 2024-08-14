package com.task8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Set;

public class WindowHandlingTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/windows");

            String originalWindow = driver.getWindowHandle();
            WebElement clickHereButton = driver.findElement(By.linkText("Click Here"));
            clickHereButton.click();

            Set<String> windowHandles = driver.getWindowHandles();
            for (String windowHandle : windowHandles) {
                if (!originalWindow.equals(windowHandle)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }

            WebElement newWindowText = driver.findElement(By.xpath("//h3[text()='New Window']"));
            if (newWindowText.isDisplayed()) {
                System.out.println("Text 'New Window' is present on the page.");
            } else {
                System.out.println("Text 'New Window' is not present on the page.");
            }

            driver.close();
            driver.switchTo().window(originalWindow);

            String originalWindowTitle = driver.getTitle();
            if (originalWindowTitle.contains("The Internet")) {
                System.out.println("Switched back to the original window successfully.");
            } else {
                System.out.println("Failed to switch back to the original window.");
            }
        } finally {
            driver.quit();
        }
    }
}
