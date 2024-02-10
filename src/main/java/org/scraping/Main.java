package org.scraping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/?_ul=RU");

        WebElement element = driver.findElement(By.className("vl-popular-destinations--evo-v1__link"));

        element.click();

        WebElement inputSearchBoots = driver.findElement(By.className("ui-autocomplete-input"));

        inputSearchBoots.sendKeys("Size 10 - Jordan 4 Retro Cement 2012");

        WebElement searchBtn = driver.findElement(By.id("gh-btn"));

        searchBtn.click();

    }
}