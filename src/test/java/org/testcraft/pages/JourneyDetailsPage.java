package org.testcraft.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JourneyDetailsPage extends BasePage {

    public JourneyDetailsPage(WebDriver driver){
        super(driver);
    }

    public void checkTimetable(){
        Assert.assertTrue("Timetable is not visible", driver.findElement(By.id("timetable")).isDisplayed());
    }

    public boolean checkPassengers(String number, String passenger){
        waitForElement(driver.findElement(By.cssSelector(".matrix-subheader-passengers")));
        List<WebElement> checking = driver.findElements(By.xpath("//div[@class='matrix-subheader']/*"));
        boolean test = false;
        for(WebElement check: checking) {
            if(check.getText().contains(number+" "+passenger)){
                test = true;
                break;
            }
        }
        return test;
    }

}
