package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class filterWithColoPage {
    WebDriver driver;
   public filterWithColoPage(WebDriver driver)
   {
       this.driver=driver;
   }
   //web elements
    public WebElement redCheckBoxEle()
    {
        WebElement checkBox = driver.findElement(By.id("attribute-option-15"));
        return checkBox;
    }
    //actions
    public void selectCheckBox()
    {
        redCheckBoxEle().click();
    }
    public boolean isSelected()
    {
        boolean flag = redCheckBoxEle().isSelected();
        return flag;
    }



}
