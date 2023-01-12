package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class resetPasswordPage {
    WebDriver driver;
    public resetPasswordPage(WebDriver driver)
    {
        this.driver=driver;
    }
    //web elements
  public WebElement emailRecoverEle()
    {
        WebElement emailRecovery = driver.findElement(By.id("Email"));
        return emailRecovery;
    }
  public WebElement recoverEle()
  {
      WebElement recoverBtn = driver.findElement(By.name("send-email"));
      return recoverBtn;
  }
  public WebElement recoveryMsg()
  {
      WebElement msgRecovery = driver.findElement(By.xpath("//div[@class=\"bar-notification success\"]"));
      return msgRecovery;
  }
  //Action
  public void enterEmailRecovery(String email)
  {
      emailRecoverEle().sendKeys(email);
  }
  public void recoverBtnClick()
  {
      recoverEle().click();
  }

}
