package com.mesaj.app.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPageObject {

    private WebDriver driver;

    public SignUpPageObject(WebDriver driver){
        this.driver = driver;
    }

    private By firstNameTextbox = By.xpath("//input[@ng-model='FirstName']");

    private By lastName = By.xpath("//input[@ng-model='Lastname']");

    private By emailAdress = By.xpath("//input[@type='email']");

    private By phone = By.xpath("//input[@type='tel']");

    private By genderMale = By.xpath("//input[@value='Male']");

    private By genderFemale = By.xpath("//input[@value='Female']");

    private By country = By.id("countries");

    private By dateOfBirthYear = By.id("yearbox");

    private By dateOfBirthMonth = By.xpath("//select[@ng-model='monthbox']");

    private By dateOfBirthDay = By.id("daybox");

    private By password = By.id("firstpassword");

    private By confirmPassword = By.id("secondpassword");

    private By submit = By.id("submitbtn");

    public void writeFirstName(String firstName){
        this.driver.findElement(this.firstNameTextbox).sendKeys(firstName);
    }

    public void writeLastName(String lastName){
        this.driver.findElement(this.lastName).sendKeys(lastName);
    }

    public void writeEmail(String email){
        this.driver.findElement(this.emailAdress).sendKeys(email);
    }

    public void writePhone(String phone){
        this.driver.findElement(this.phone).sendKeys(phone);
    }

    public void selectMale(){
        this.driver.findElement(this.genderMale).click();
    }

    public void selectFemale(){
        this.driver.findElement(this.genderFemale).click();
    }

    public void selectCountry(String country){
        new Select(this.driver.findElement(this.country)).selectByValue(country);
    }

    public void selectBirthDay(String day){
        new Select(this.driver.findElement(this.dateOfBirthDay)).selectByValue(day);
    }

    public void selectBirthMonth(String month){
        new Select(this.driver.findElement(this.dateOfBirthMonth)).selectByValue(month);
    }

    public void selectBirthYear(String year){
        new Select(this.driver.findElement(this.dateOfBirthYear)).selectByValue(year);
    }

    public void writePassword(String password){
        this.driver.findElement(this.password).sendKeys(password);
    }

    public void writeConfirmPassword(String password){
        this.driver.findElement(this.confirmPassword).sendKeys(password);
    }

    public void clickOnSubmit(){
        this.driver.findElement(this.submit).click();
    }
}