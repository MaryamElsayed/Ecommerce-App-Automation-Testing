package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class addProductsToCartPage {
    WebDriver driver;
    public addProductsToCartPage(WebDriver driver)
    {
        this.driver=driver;
    }
    //web elements
    public WebElement btnOneEle ()
    {
        WebElement AddBtnOne = driver.findElement(By.xpath("//button[@class=\"button-2 product-box-add-to-cart-button\"]"));
        return AddBtnOne;
    }

    public WebElement btnTwoEle()
    {
        WebElement AddBtnTwo = driver.findElement(By.id("add-to-cart-button-25"));
        return AddBtnTwo;
    }
    public WebElement MessageEle()
    {
        WebElement msg = driver.findElement(By.xpath("//p[@class='content']"));
        return msg;
    }
    public WebElement cartLinkEle()
    {
        WebElement link = driver.findElement(By.xpath("//a[contains(text(),'shopping cart')]"));
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
    public void linkClick()
    {
        cartLinkEle().click();
    }


}
