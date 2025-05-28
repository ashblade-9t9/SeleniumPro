package genericLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities extends BaseClass{

public void scrollTillElement(WebElement ele)
{
    JavascriptExecutor js = (JavascriptExecutor) driver;
//          js.executeScript("window.scrollBy(0,500)");
    js.executeScript("arguments[0].scrollIntoView();", ele);
}
public void selectOption(WebElement ele,String text)
{
    Select s =new Select(ele);
    s.selectByVisibleText(text);
}
}
