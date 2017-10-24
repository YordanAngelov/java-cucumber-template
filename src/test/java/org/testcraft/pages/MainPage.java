package org.testcraft.pages;

import net.sf.cglib.core.Local;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver){
        super(driver);
    }

    public void selectOriginCity(String origin){
        driver.findElement(By.id("originStation")).sendKeys(origin, Keys.TAB);
    }

    public void selectDestinationCity(String destination){
        driver.findElement(By.id("destinationStation")).sendKeys(destination, Keys.TAB);
    }

    public void submit(){
        driver.findElement(By.id("submitButton")).click();
    }

    public void checkTitle(String check){
        String title = driver.getTitle();
        Assert.assertTrue("Title is not correct",title.contains(check));
    }

    public void selectReturn(){
        driver.findElement(By.id("journey-type-return")).click();
    }

    public void selectDateUsingButton(String button){
        driver.findElement(By.xpath("//button[contains(text(),'"+button+"')]")).click();
    }

    public void pickFutureOutDate(String days){
        List<WebElement> dates = driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/*"));
        LocalDate today = LocalDate.now();
//        LocalDate
    }

}
