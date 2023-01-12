package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerPage {
    WebDriver driver;
    public registerPage(WebDriver driver)
    {
        this.driver=driver;
    }
    //web elements
    public WebElement genderEle()
    {
        WebElement femaleRadioBtn=driver.findElement(By.id("gender-female"));
        return femaleRadioBtn;
    }
    public WebElement fistNameEle()
    {
        WebElement firstName = driver.findElement(By.id("FirstName"));
        return firstName;
    }
    public WebElement lastNameEle()
    {
        WebElement lastName = driver.findElement(By.id("LastName"));
        return lastName;
    }
    public WebElement emailEle()
    {
        WebElement email = driver.findElement(By.id("Email"));
        return email;
    }
    public WebElement companyEle()
    {
        WebElement company = driver.findElement(By.id("Company"));
        return company;
    }
    public WebElement passwordEle()
    {
        WebElement password = driver.findElement(By.id("Password"));
        return password;
    }

    public WebElement confirmPassEle()
    {
        WebElement confirmPass = driver.findElement(By.id("ConfirmPassword"));
        return confirmPass;
    }

    public WebElement registrationMessageEle()
    {
        WebElement message =driver.findElement(By.className("result"));
        return message;
    }


    //Actions

    public void gender()
    {
        genderEle().click();

    }
    public void firstName(String first_name)
    {

        fistNameEle().sendKeys(first_name);
    }
     public void lastName(String last_name)
     {

         lastNameEle().sendKeys(last_name);
     }
    public void emailEntry(String email)
      {
        emailEle().sendKeys(email);
      }
    public void company(String company_name)
      {
          companyEle().sendKeys(company_name);
      }
    public void passwordEntry(String password)
       {
           passwordEle().sendKeys(password);
       }
    public void confirmPasswordEntry(String confirmPassword)
        {
            confirmPassEle().sendKeys(confirmPassword);
        }




}
