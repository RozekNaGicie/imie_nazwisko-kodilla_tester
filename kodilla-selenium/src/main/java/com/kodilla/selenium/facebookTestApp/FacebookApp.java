package com.kodilla.selenium.facebookTestApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        WebElement selectField = driver.findElement(By.xpath("//select[@aria-label=\"Rok\"]"));
        Select yearSelect = new Select(selectField);
        yearSelect.selectByIndex(5);
    }
}
