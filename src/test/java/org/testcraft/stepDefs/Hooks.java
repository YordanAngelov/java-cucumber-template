package org.testcraft.stepDefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testcraft.pages.FareFinderPage;
import org.testcraft.pages.JourneyDetailsPage;
import org.testcraft.pages.MainPage;

public class Hooks {

    public static WebDriver driver;
    public static MainPage mainPage;
    public static JourneyDetailsPage journeyDetailsPage;
    public static FareFinderPage fareFinderPage;

    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        journeyDetailsPage = new JourneyDetailsPage(driver);
        fareFinderPage = new FareFinderPage(driver);
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
