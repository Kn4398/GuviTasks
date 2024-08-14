package com.task7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://jqueryui.com/droppable/");

            WebElement frame = driver.findElement(By.className("demo-frame"));
            driver.switchTo().frame(frame);

            WebElement sourceElement = driver.findElement(By.id("draggable"));
            WebElement targetElement = driver.findElement(By.id("droppable"));

            Actions actions = new Actions(driver);
            actions.dragAndDrop(sourceElement, targetElement).perform();

            String targetBackgroundColor = targetElement.getCssValue("background-color");
            System.out.println("Target Background Color: " + targetBackgroundColor);

            String targetText = targetElement.findElement(By.tagName("p")).getText();
            System.out.println("Target Text: " + targetText);

            if ("Dropped!".equals(targetText) && !targetBackgroundColor.equals("rgba(0, 0, 0, 0)")) {
                System.out.println("Drag and drop operation successful.");
            } else {
                System.out.println("Drag and drop operation failed.");
            }
        } finally {
            driver.quit();
        }
    }
}
