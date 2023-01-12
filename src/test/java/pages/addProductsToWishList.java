package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class addProductsToWishList {
    WebDriver driver;
    public addProductsToWishList(WebDriver driver)
    {
        this.driver=driver;
    }
    //web elements
    public WebElement btnOneEle ()
    {
        WebElement AddBtnOne = driver.findElement(By.xpath("//button[@class=\"button-2 add-to-wishlist-button\"]"));
        return AddBtnOne;
    }

    public WebElement btnTwoEle()
    {
        WebElement AddBtnTwo = driver.findElement(By.id("add-to-wishlist-button-25"));
        return AddBtnTwo;
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
    public WebElement MessageEle()
    {
        WebElement msg = driver.findElement(By.xpath("//p[@class='content']"));
        return msg;
    }
    public WebElement wishLinkEle()
    {
        WebElement link = driver.findElement(By.xpath("//a[contains(text(),'wishlist')]"));
        return link;
    }
    public WebElement productEle()
    {
        WebElement productName = driver.findElement(By.xpath("//a[@class='product-name']"));
        return productName;
    }
    //actions
    public void AddBtnOneClick()
    {
        btnOneEle().click();
    }
    public void AddBtnTwoClick()
    {
        btnTwoEle().click();
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
    public void linkClick()
    {
        wishLinkEle().click();
    }


}
