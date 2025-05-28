package practice;

import genericLibrary.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AllWebElements extends BaseClass {

    String target;
    public  WebElement dynamicEle;

    @Test
    public WebElement eleAddressOf(String tool) {
        boolean found = false;
        for (int i = 1; i < 7; i++) {

            target = driver.findElement(By.xpath("(//span[@class='pr-1']/parent::div)[" + i + "]")).getText();
            if (target.equalsIgnoreCase(tool)) {
                dynamicEle=driver.findElement(By.xpath("(//span[@class='pr-1']/parent::div)[" + i + "]"));
                found = true;
                break;
            }
        }
        if (found != true) {
            System.out.println("Elements not found");
//            driver.quit();
        }
        return dynamicEle;
    }

    public void drag() {
        dynamicEle.click();
        driver.findElement(By.id("userName")).sendKeys("I'm Roger");
        System.out.println("test successful");
        driver.quit();
    }

}
