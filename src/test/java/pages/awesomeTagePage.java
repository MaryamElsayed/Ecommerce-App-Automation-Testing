package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class awesomeTagePage {
    WebDriver driver;
    public awesomeTagePage(WebDriver driver)
    {
        this.driver=driver;
    }
    //web elements
    public WebElement searchEle()
    {
        WebElement searchLink = driver.findElement(By.xpath("//a[contains(text(),'Search')]"));
        return searchLink;
    }
    public WebElement awesomeEle()
    {
        WebElement searchLink = driver.findElement(By.xpath("//a[contains(text(),'awesome')]"));
        return searchLink;
    }
    //actions
    public void searchClick()
    {
        searchEle().click();
    }
    public void awesomeClick()
    {
        awesomeEle().click();
    }
}
