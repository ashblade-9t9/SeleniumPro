package stepDefinitions;


import genericLibrary.BaseClass;
import genericLibrary.WebDriverUtilities;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.Widgets;
import practice.AllWebElements;

import java.time.Duration;


public class DropdownViaCucumber extends BaseClass {

    AllWebElements awe = new AllWebElements();
    Widgets widget;
    String selectedOption;
    WebDriverUtilities util = new WebDriverUtilities();

    @Given("User opened the bowser")
    public void user_opened_the_bowser() {
        tearUp();
    }

    @Then("Maximized it and visited the website")
    public void maximized_it_and_visited_the_website() {
        System.out.println("Success");
    }

    @And("Selected the {string} option")
    public void selected_the_option(String function) throws InterruptedException {
        widget = new Widgets(driver);
        util.scrollTillElement(awe.eleAddressOf("Widgets"));
        awe.eleAddressOf(function).click();
        util.scrollTillElement(awe.eleAddressOf("Interactions"));
    }

    @Then("Selected value from the dropdown")
    public void selected_value_from_the_dropdown() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(widget.selectMenu));
        widget.selectMenu.click();
        widget.options.click();
        Actions action = new Actions(driver);
        action.moveToElement(widget.firstOption).click().perform();
         selectedOption = widget.firstOption.getText();
    }

    @When("Successfully executed it will close the window")
    public void successfully_executed_it_will_close_the_window() {
        if (selectedOption.equalsIgnoreCase("Group 1, option 1")) {
            tearDown();
        } else {
            System.out.println("Failed");
        }

    }
}
