package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class searchPage {
    WebDriver driver;
    public searchPage(WebDriver driver)
    {
        this.driver=driver;
    }
    //Web Elements
    public WebElement searchBarEle()
    {
        WebElement searchBar = driver.findElement(By.id("small-searchterms"));
        return searchBar;
    }
    public WebElement searchBtnEle()
    {
        WebElement searchBtn = driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
        return searchBtn;
    }
    public List<WebElement> searchedItemsEle()
    {
       List<WebElement> searchedItems = driver.findElements(By.xpath("//h2/a"));
        return searchedItems;
    }
    //Actions
    public void searchProduct(String product)
    {
        searchBarEle().sendKeys(product);
    }
    public void searchBtnClick()
    {
        searchBtnEle().click();
    }
    public int SearchedItemsCount() {
        int count = searchedItemsEle().size();
        return count;
    }
}
