package com.kodilla.selenium.visualTVN;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Paths;
import java.time.Duration;

public class OcularExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        WebDriver driver = new ChromeDriver(chromeOptions);

        Ocular.config()
                .resultPath(Paths.get("C:\\Users\\Mateusz\\Desktop\\kodilla\\kodilla-selenium\\src\\main\\java\\com\\kodilla\\selenium\\visualTVN\\result"))
                .snapshotPath(Paths.get("C:\\Users\\Mateusz\\Desktop\\kodilla\\kodilla-selenium\\src\\main\\java\\com\\kodilla\\selenium\\visualTVN\\snapshot"))
                .globalSimilarity(95)
                .saveSnapshot(true);

        TvnMainPage tvnPage = new TvnMainPage(driver);
        tvnPage.open();
        WebElement wait = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"rodoLayer\"]/div/div[1]/a")));
        wait.findElement(By.xpath("//*[@id=\"rodoLayer\"]/div/div[1]/a")).click();
        driver.navigate().refresh();

        wait = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("adoceantvnkfqhdwfudy3")));

        tvnPage.compare();
        tvnPage.close();
    }

}
