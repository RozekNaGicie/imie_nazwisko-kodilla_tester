package com.kodilla.selenium.visualTVN;

import com.testautomationguru.ocular.Ocular;
import com.testautomationguru.ocular.snapshot.Snap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Snap("TvnMainPage.png")
public class TvnMainPage {

    private static final String pageURL = "https://tvn24.pl/polska/senat-syn-aleksandra-pocieja-rozbawil-politykow-4602028?kampania_testowa_nowa24";
    private WebDriver webdriver;
    public TvnMainPage(WebDriver webdriver){
        this.webdriver = webdriver;
    }
    public void open(){
        webdriver.get(pageURL);
    }

    public void close() {
        webdriver.quit();
    }
    public void compare() {
        Ocular.snapshot()
                .from(this)
                .sample().using(webdriver)
                .compare();

    }
    public void btnAcc() {
        WebElement btn = webdriver.findElement(By.className("rodoFooterBtnAccept"));
        btn.submit();
    }
}
