package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class currencySwitchPage {
    WebDriver driver;
    public currencySwitchPage (WebDriver driver)
    {
        this.driver=driver;
    }
    //web elements
    public WebElement currencyMenuEle()
    {
        WebElement currency = driver.findElement(By.id("customerCurrency"));
        return currency;
    }
    public List<WebElement> products()
    {
        List<WebElement> prices =driver.findElements(By.xpath("//div[@class=\"prices\"]/span"));
        return prices;
    }
    public void changeCurrency()
    {
        Select currencyChange = new Select(currencyMenuEle());
        currencyChange.selectByVisibleText("Euro");
    }
}
