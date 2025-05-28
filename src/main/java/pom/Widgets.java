package pom;

import genericLibrary.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Widgets {

    @FindBy(xpath = "//div[text()='Group 1, option 1']")
    public WebElement firstOption;

    @FindBy(xpath = "//span[text()='Select Menu']")
    public WebElement selectMenu;

    @FindBy(xpath = "//div[text()='Select Option']")
    public WebElement options;

    public Widgets(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
