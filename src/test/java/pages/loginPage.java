package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {
    WebDriver driver;

    public loginPage(WebDriver driver)
    {
        this.driver=driver;
    }


    public WebElement usernameEle()
    {
        WebElement EmailEle= driver.findElement(By.id("Email"));
        return EmailEle;
    }
    public WebElement passwordEle()
    {
        WebElement passwordEle= driver.findElement(By.id("Password"));
        return passwordEle;
    }
    public WebElement recoverPasswordEle()
    {
        WebElement recoverPassword=driver.findElement(By.linkText("Forgot password?"));
        return recoverPassword;
    }
    //Actions
    public void enterUserData(String username,String password)
    {
        usernameEle().clear();
        usernameEle().sendKeys(username);
        passwordEle().sendKeys(password);

    }
    public void recoverPasswordClick()
    {
        recoverPasswordEle().click();
    }
}
