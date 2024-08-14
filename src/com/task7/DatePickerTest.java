package com.task7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://jqueryui.com/datepicker/");
            
            WebElement frame = driver.findElement(By.className("demo-frame"));
            driver.switchTo().frame(frame);

            WebElement datePickerInput = driver.findElement(By.id("datepicker"));
            datePickerInput.click();

            WebElement nextMonthButton = driver.findElement(By.xpath("//a[@data-handler='next']"));
            nextMonthButton.click();

            WebElement date = driver.findElement(By.xpath("//a[text()='22']"));
            date.click();

            String selectedDate = datePickerInput.getAttribute("value");
            System.out.println("Selected Date: " + selectedDate);
        } finally {
            driver.quit();
        }
    }
}
