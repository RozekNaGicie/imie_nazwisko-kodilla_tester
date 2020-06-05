package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestApp {

    final private static String url = "https://allegro.pl/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement fillSearcher = driver.findElement(By.xpath("//*[@slot=\"button\"]/button[2]"));
        fillSearcher.click();
        fillSearcher = driver.findElement(By.xpath("//*[@class=\"_1h7wt _d25db_UtYE1\"]/input[1]"));
        fillSearcher.sendKeys("mavic mini");
        fillSearcher = driver.findElement(By.xpath("//*[@class=\"_1h7wt _d25db_UtYE1\"]/div[2]/div[1]/select/optgroup[1]"));
        Select categorySelect = new Select(fillSearcher);
        categorySelect.selectByIndex(3);
        fillSearcher.submit();
    }

}
