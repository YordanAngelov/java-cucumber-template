package org.testcraft.pages;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class FareFinderPage extends BasePage {

    public FareFinderPage(WebDriver driver){
        super(driver);
    }

    public void getPage(){
        driver.get("https://www.thetrainline.com/farefinder/");
    }

}
