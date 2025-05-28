package genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    @BeforeTest
    public  void tearUp()
    {
         driver = new ChromeDriver();
        driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.get("https://demoqa.com/text-box");
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}
