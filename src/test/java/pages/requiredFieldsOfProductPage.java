package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class requiredFieldsOfProductPage {
    WebDriver driver;
    addProductsToCartPage product;
    public requiredFieldsOfProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();
    }
    public WebElement sizeMenuEle()
    {
        WebElement size = driver.findElement(By.id("product_attribute_9"));
        return size;
    }
    public WebElement colorEle()
    {
        WebElement color = driver.findElement(By.xpath("//span[@style=\"background-color:#663030\"]"));
        return color;
    }
    public void chooseSize()
    {
        Select currencyChange = new Select(sizeMenuEle());
        currencyChange.selectByVisibleText("8");
    }
    public void chooseColor()
    {
        colorEle().click();
    }
}
