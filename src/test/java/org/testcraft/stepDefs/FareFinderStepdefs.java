package org.testcraft.stepDefs;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.testcraft.pages.FareFinderPage;

public class FareFinderStepdefs {

    public WebDriver driver;
    public FareFinderPage fareFinderPage;

    public FareFinderStepdefs() {
        driver = Hooks.driver;
        fareFinderPage = Hooks.fareFinderPage;
    }

    @Given("^I am on www.thetrainline.com/farefinder$")
    public void iAmOnWwwThetrainlineComFarefinder() throws Throwable {
        fareFinderPage.getPage();
    }

}
