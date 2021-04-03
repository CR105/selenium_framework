package com.mesaj.app.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpServices {

    private WebDriver driver;
    private SignUpPageObject signUpPageObject;

    public SignUpServices(){
        this.driver = driver;
        signUpPage = new SignUpPageObject(driver);
    }

    public void go(String url) {
        this.driver.get(url);
    }

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
