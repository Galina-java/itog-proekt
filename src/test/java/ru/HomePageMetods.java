package ru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePageMetods {

    private static final String URL = "https://skillfactory.ru/";
    private final WebDriver driver;
    private HomePageMetods homePageMetods;

    public HomePageMetods(WebDriver webdriver) {
        this.driver = webdriver;

    }

    public void goUrl(String Url) {
        driver.get(URL);
    }

    public void clickLogotipe() {
        WebElement logotip = driver.findElement(new By.ByXPath("//*[@id=\"rec456746055\"]/div/div/div[46]/a/img"));
        logotip.click();
    }

    public void urlAllKurs() {
        Actions action = new Actions(driver);
        WebElement Kurs = driver.findElement(new By.ByClassName("tn-elem__4567460551658239202599"));
        Kurs.click();
        WebElement allKurs = driver.findElement(new By.ByXPath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[1]/div/a/span"));

        action.moveToElement(allKurs).build().perform();
        allKurs.click();
    }


    public void KursFreeEvents() {

        WebElement KursFreeEvents = driver.findElement(new By.ByXPath("//*[@id=\"rec456746055\"]/div/div/div[41]"));
        KursFreeEvents.click();

    }

    public void KorporStud() {
        WebElement HeadKorporStud = driver.findElement(new By.ByXPath("//*[@id=\"rec456746055\"]/div/div/div[42]/a"));
        HeadKorporStud.click();

    }

    public void equalSotrudnUrl(){

        WebElement SotrudnGet = driver.findElement(new By.ByXPath("//*[@id=\"rec456746055\"]/div/div/div[44]/a"));
        SotrudnGet.click();
    }

    public void equalBlogUrl(){
        WebElement BlogButton = driver.findElement(new By.ByXPath("//*[@id=\"rec456746055\"]/div/div/div[43]/a"));
        BlogButton.click();
    }


    public void checkFooterYandex(){
        WebElement YaUrl = driver.findElement(new By.ByXPath("//*[@id=\"rec298827602\"]/div/div/div[15]/div/a"));
        YaUrl.click();
    }
}
