package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addProductsToCompareListPage {
    WebDriver driver;
    public addProductsToCompareListPage(WebDriver driver)
    {
        this.driver=driver;
    }
    //web elements
    public WebElement btnOneEle ()
    {
        WebElement AddBtnOne = driver.findElement(By.xpath("//button[@class=\"button-2 add-to-compare-list-button\"]"));
        return AddBtnOne;
    }


    public WebElement MessageEle()
    {
        WebElement msg = driver.findElement(By.xpath("//p[@class='content']"));
        return msg;
    }
    public WebElement compareLinkEle()
    {
        WebElement link = driver.findElement(By.xpath("//a[contains(text(),'product comparison')]"));
        return link;
    }
    public WebElement productEle()
    {
        WebElement productName = driver.findElement(By.xpath("//tr[@class='product-name']//a"));
        return productName;
    }
    //actions
    public void AddBtnOneClick()
    {
        btnOneEle().click();
    }


    public void linkClick()
    {
        compareLinkEle().click();
    }


}
