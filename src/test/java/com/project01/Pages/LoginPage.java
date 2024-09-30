package com.project01.Pages;

import com.project01.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[data-test=\"username\"]")
    private WebElement userInput;

    @FindBy(css = "[data-test=\"password\"]")
    private WebElement passwordInput;

    @FindBy(css = "[data-test=\"login-button\"]")
    private WebElement loginBtn;



    public AddToCartSectionPage login(String email , String pass) throws InterruptedException {
        userInput.sendKeys(email);
        Thread.sleep(1500);
        passwordInput.sendKeys(pass);
        Thread.sleep(1500);
        loginBtn.click();
        Thread.sleep(1500);
        return new AddToCartSectionPage(driver);
    }

    public LoginPage load(){
        driver.get("https://www.saucedemo.com/");
        return this;
    }

    public LoginPage sleep() throws InterruptedException {
        Thread.sleep(1500);
        return this ;
    }




}
