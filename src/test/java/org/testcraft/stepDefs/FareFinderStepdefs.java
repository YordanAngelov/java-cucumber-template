package org.testcraft.stepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
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

    @When("^I look for trains from \"([^\"]*)\" to \"([^\"]*)\"$")
    public void iLookForTrainsFromTo(String arg1, String arg2) throws Throwable {
        fareFinderPage.selectOriginCity(arg1);
        fareFinderPage.selectDestinationCity(arg2);
    }
}
