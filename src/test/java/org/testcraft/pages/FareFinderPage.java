package org.testcraft.pages;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FareFinderPage extends BasePage {

    public FareFinderPage(WebDriver driver){
        super(driver);
    }

    public void getPage(){
        driver.get("https://www.thetrainline.com/farefinder/");
    }

    public void selectOriginCity(String origin){
        driver.findElement(By.id("originStationsLabel")).sendKeys(origin);
//        Select select = new Select(driver.findElement(By.cssSelector(".ui-corner-all")));
//        List<WebElement> suggestion = driver.findElements(By.cssSelector(".ui-corner-all"));
//        for(WebElement check : suggestion) {
//            System.out.println("Number of autosuggestions is:"+check.getText()  2);
//        }
//        select.selectByVisibleText("Aberdeen (ABD)");
    }

    public void selectDestinationCity(String destination){
        driver.findElement(By.id("destinationStationsLabel")).sendKeys(destination, Keys.ARROW_DOWN, Keys.ENTER);
    }

}