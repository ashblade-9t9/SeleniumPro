package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import genericLibrary.Property;
import java.util.concurrent.TimeUnit;

public class DragAndDrop extends Property {

    @Test
    public void dragDropTest() throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable");
        WebElement src = driver.findElement(By.id("draggable"));
        WebElement dest = driver.findElement(By.id("droppable"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
//          js.executeScript("window.scrollBy(0,500)");
        js.executeScript("arguments[0].scrollIntoView();", src);
        String colorBefore = dest.getCssValue("background-color");
        Actions a = new Actions(driver);
//        a.dragAndDrop(src,dest).perform();
        a.clickAndHold(src).moveToElement(dest).release().build().perform();
        Thread.sleep(3000);
        String colorAfter = dest.getCssValue("background-color");
        if (!colorBefore.equals(colorAfter)) {
            System.out.println("BeforeColor : " + colorBefore + " AfterColor : " + colorAfter);
            driver.quit();
        } else {
            System.out.println("BeforeColor " + colorBefore + " AfterColor" + colorAfter);
        }
    }
}

