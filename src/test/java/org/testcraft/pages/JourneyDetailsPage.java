package org.testcraft.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JourneyDetailsPage extends BasePage {

    public JourneyDetailsPage(WebDriver driver){
        super(driver);
    }

    public void checkTimetable(){
        Assert.assertTrue("Timetable is not visible", driver.findElement(By.id("timetable")).isDisplayed());
    }

}
