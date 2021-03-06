package org.testcraft.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver){
        super(driver);
    }

    public void selectOriginCity(String origin){
        waitForElement(driver.findElement(By.id("originStation")));
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

    public void pickFutureReturnDate(int days){
        driver.findElement(By.id("returnDate")).click();
        LocalDate futureDate = LocalDate.now().plusDays(days);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d");
        String parsedDate = futureDate.format(formatter);
        String[] splitParsedDate = parsedDate.split(" ");
        /** Selects month if it does not match the current month */
        while(!driver.findElement(By.cssSelector(".ui-datepicker-title")).getText().contains(splitParsedDate[0])) {
                driver.findElement(By.cssSelector(".ui-datepicker-next.ui-corner-all")).click();
        }
        /** Selects day */
        List<WebElement> columns = driver.findElement(By.cssSelector("#ui-datepicker-div")).findElements(By.tagName("td"));
        for (WebElement date : columns) {
            if (date.getText().equals(splitParsedDate[1])) {
                date.click();
                break;
            }
        }
    }

    public void clickPeopleButton() {
        driver.findElement(By.cssSelector(".btn.btn-default.btn-open")).click();
    }

    public void selectDropdownList(String dropdownID, String selectText){
        Select select = new Select(driver.findElement(By.id(dropdownID)));
        select.selectByVisibleText(selectText);
    }

    public void selectNumberOfAdults(String arg1) {
        selectDropdownList("adults",arg1);
    }

    public void selectNumberOfKids(String arg1) {
        selectDropdownList("children",arg1);
    }

    public void submitPeopleTravelling() {
        driver.findElement(By.cssSelector(".btn.btn-block.btn-primary.btn-done")).click();
    }
}
