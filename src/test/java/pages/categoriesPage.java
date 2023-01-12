package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class categoriesPage {
    WebDriver driver;
    Actions actions;
    public categoriesPage(WebDriver driver)
    {
        this.driver=driver;
        actions = new Actions(driver);
    }
    public WebElement mainMenuEle()
    {
        WebElement mainMenu =driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        return mainMenu;
    }
    public WebElement subMenuEle()
    {
        WebElement subMenu =driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a[1]"));
        return subMenu;
    }

    public void moveToMainMenu()
    {
        actions.moveToElement(mainMenuEle());
    }
    public void moveToSubMenu()
    {
        actions.moveToElement(subMenuEle());
        actions.click().build().perform();
    }


}
