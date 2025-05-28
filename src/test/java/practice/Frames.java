package practice;

import genericLibrary.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Frames extends BaseClass {
    @Test
    public void switchFrames() throws InterruptedException {
        driver.get("https://demoqa.com/frames");
        WebElement frame1 = driver.findElement(By.id("frame1"));
        WebElement frame2 = driver.findElement(By.id("frame2"));

        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",frame2);
        driver.switchTo().frame(frame2);
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,500);");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();


    }
}
