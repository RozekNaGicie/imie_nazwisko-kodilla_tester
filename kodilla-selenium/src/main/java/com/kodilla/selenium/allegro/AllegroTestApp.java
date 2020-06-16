package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestApp {

    final private static String url = "https://allegro.pl/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        // cookies alert cant be close by alert.accept();
        WebElement fillSearcher = driver.findElement(By.xpath("//*[@slot=\"button\"]/button[2]"));
        fillSearcher.click();
        fillSearcher = driver.findElement(By.xpath("//*[@class=\"_1h7wt _d25db_UtYE1\"]/div[2]/div[1]/select"));
        Select categorySelect = new Select(fillSearcher);
        categorySelect.selectByValue("/kategoria/elektronika");
        fillSearcher = driver.findElement(By.xpath("//*[@class=\"_1h7wt _d25db_UtYE1\"]/input[1]"));
        fillSearcher.sendKeys("mavic mini");

        //needs to be click() by selenium
        WebElement btn = driver.findElement(By.xpath("//*[@class=\"_1h7wt _d25db_UtYE1\"]/button"));
        btn.click();

        
    }

}
