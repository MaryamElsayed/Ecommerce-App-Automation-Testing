package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Home {
    WebDriver driver;
    public Home(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();
    }
    public void openHomePage() {
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    public void clickOnLogin()
    {
        WebElement loginBtn = driver.findElement(By.className("ico-login"));
        loginBtn.click();
    }

    public void clickOnRegister()
    {
        WebElement registerBtn =driver.findElement(By.className("ico-register"));
        registerBtn.click();
    }

}
