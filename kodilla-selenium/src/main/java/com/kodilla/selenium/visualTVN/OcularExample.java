package com.kodilla.selenium.visualTVN;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class OcularExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        Ocular.config()
                .resultPath(Paths.get("C:\\Users\\Mateusz\\Desktop\\kodilla\\kodilla-selenium\\src\\main\\java\\com\\kodilla\\selenium\\visualTVN\\result"))
                .snapshotPath(Paths.get("C:\\Users\\Mateusz\\Desktop\\kodilla\\kodilla-selenium\\src\\main\\java\\com\\kodilla\\selenium\\visualTVN\\snapshot"))
                .globalSimilarity(95)
                .saveSnapshot(true);

        TvnMainPage tvnPage = new TvnMainPage(driver);
        tvnPage.open();
        tvnPage.compare();
        tvnPage.close();
    }
}
