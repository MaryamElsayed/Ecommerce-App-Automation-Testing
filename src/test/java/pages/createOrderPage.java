package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class createOrderPage {
    WebDriver driver;
    //web elements
    public createOrderPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public WebElement termsEle()
    {
        WebElement term = driver.findElement(By.id("termsofservice"));
        return term;
    }
    public WebElement checkOutEle()
    {
        WebElement checkOut = driver.findElement(By.id("checkout"));
        return checkOut;
    }
    public WebElement firstNameEle()
    {
        WebElement firstName = driver.findElement(By.id("BillingNewAddress_FirstName"));
        return firstName;
    }
    public WebElement lastNameEle()
    {
        WebElement lastName = driver.findElement(By.id("BillingNewAddress_LastName"));
        return lastName;
    }
    public WebElement EmailEle()
    {
        WebElement email = driver.findElement(By.id("BillingNewAddress_Email"));
        return email;
    }
    public WebElement countryEle()
    {
        WebElement country = driver.findElement(By.xpath("//select[@id=\"BillingNewAddress_CountryId\"]"));
        return country;
    }
    public WebElement cityEle()
    {
        WebElement city = driver.findElement(By.id("BillingNewAddress_City"));
        return city;
    }
    public WebElement addressEle()
    {
        WebElement address = driver.findElement(By.id("BillingNewAddress_Address1"));
        return address;
    }
    public WebElement postalEle()
    {
        WebElement postal = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        return postal;
    }
    public WebElement phoneEle()
    {
        WebElement phone = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        return phone;
    }
    public WebElement continueOneEle()
    {
        WebElement contOne = driver.findElement(By.xpath("//button[@onClick=\"Billing.save()\"]"));
        return contOne;
    }
    public WebElement continueTwoEle()
    {
        WebElement contTwo = driver.findElement(By.xpath("//button[@onClick=\"ShippingMethod.save()\"]"));
        return contTwo;
    }
    public WebElement continueThreeEle()
    {
        WebElement contThree = driver.findElement(By.xpath("//button[@onClick=\"PaymentMethod.save()\"]"));
        return contThree;
    }
    public WebElement continueFourEle()
    {
        WebElement contFour = driver.findElement(By.xpath("//button[@onClick=\"PaymentInfo.save()\"]"));
        return contFour;
    }
    public WebElement continueFiveEle()
    {
        WebElement contFive = driver.findElement(By.className("confirm-order-next-step-button"));
        return contFive;
    }
    public WebElement messageEle()
    {
        WebElement msg = driver.findElement(By.xpath("//h1"));
        return msg;
    }
    //actions
    public void termsClick()
    {
        termsEle().click();
    }
    public void checkOutClick()
    {
        checkOutEle().click();
    }
    public void infoEntry(String firstName, String lastName, String email, String country, String city, String address, String postal, String phone)
    {
        firstNameEle().clear();
        firstNameEle().sendKeys(firstName);
        lastNameEle().clear();
        lastNameEle().sendKeys(lastName);
        EmailEle().clear();
        EmailEle().sendKeys(email);
        Select countrySelect = new Select(countryEle());
        countrySelect.selectByVisibleText(country);
        cityEle().clear();
        cityEle().sendKeys(city);
        addressEle().clear();
        addressEle().sendKeys(address);
        postalEle().clear();
        postalEle().sendKeys(postal);
        phoneEle().clear();
        phoneEle().sendKeys(phone);
    }
    public void completeOrder() throws InterruptedException {
        continueOneEle().click();
        Thread.sleep(2000);
        continueTwoEle().click();
        Thread.sleep(3000);
        continueThreeEle().click();
        Thread.sleep(2000);
        continueFourEle().click();
        Thread.sleep(2000);
        continueFiveEle().click();
        System.out.println("DONE");
    }




}
