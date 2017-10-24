package org.testcraft.stepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testcraft.pages.JourneyDetailsPage;
import org.testcraft.pages.MainPage;

public class PlanJourneyStepdefs {

    /** Made for exercise_one.feature */

    public WebDriver driver;
    public MainPage mainPage;
    public JourneyDetailsPage journeyDetailsPage;

    public PlanJourneyStepdefs() {
        driver = Hooks.driver;
        mainPage = Hooks.mainPage;
        journeyDetailsPage = Hooks.journeyDetailsPage;
    }

    @Given("^I am on www\\.thetrainline\\.com main page$")
    public void i_am_on_www_thetrainline_com_main_page() throws Throwable {
        driver.get("https://www.thetrainline.com/");
        mainPage.checkTitle("Trainline");
    }

    @When("^I search for trains from \"([^\"]*)\" to \"([^\"]*)\"$")
    public void i_search_for_trains_from_to(String arg1, String arg2) throws Throwable {
        mainPage.selectOriginCity(arg1);
        mainPage.selectDestinationCity(arg2);
    }

    @Then("^I click on the button to retrieve the times and prices$")
    public void i_click_on_the_button_to_retrieve_the_times_and_prices() throws Throwable {
        mainPage.submit();
        journeyDetailsPage.checkTimetable();
    }

    @And("^I click the return radio button$")
    public void i_click_the_return_radio_button(){
        mainPage.selectReturn();
    }

    @And("^Choose \"([^\"]*)\" as Out date and \"([^\"]*)\" as Return date$")
    public void choose_out_date_and_return_date(String arg1, String arg2){
        mainPage.selectDateUsingButton(arg1);
        mainPage.selectDateUsingButton(arg2);
    }

    @And("^Choose \"([^\"]*)\" as Out date and Return date is \"([^\"]*)\" days later$")
    public void chooseAsOutDateAndReturnDateIsDaysLater(String arg1, String arg2) throws Throwable {
        mainPage.selectDateUsingButton(arg1);
        mainPage.pickFutureOutDate(arg2);
    }

}