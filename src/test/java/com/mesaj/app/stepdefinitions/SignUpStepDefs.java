package com.mesaj.app.stepdefinitions;

import com.mesaj.app.pageobjects.SignUpPageObject;
import com.mesaj.app.util.RandomNumberGenerator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpStepDefs {
    @Given("^Pepito wants to have an account$")
    public void pepito_wants_to_have_an_account() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/mac/chromedriver");

        WebDriver driver = new ChromeDriver();

        SignUpPageObject signUpPageObject = new SignUpPageObject(driver);

        signUpPageObject.go("http://demo.automationtesting.in/Register.html");
        signUpPageObject.writeFirstName("Pepito");
        signUpPageObject.writeLastName("Perez");
        signUpPageObject.writeEmail("peresp@mail.com");
        signUpPageObject.selectMale();
        signUpPageObject.selectCountry("Colombia");
        signUpPageObject.selectBirthDay("10");
        signUpPageObject.selectBirthMonth("February");
        signUpPageObject.selectBirthYear("1989");
        signUpPageObject.writePhone(RandomNumberGenerator.get());
        signUpPageObject.writePassword("noespassword");
        signUpPageObject.writeConfirmPassword("noespassword");

        signUpPageObject.clickOnSubmit();

        Thread.sleep(4000);
        driver.quit();

    }

    @When("^he sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() {

    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() {

    }

}
