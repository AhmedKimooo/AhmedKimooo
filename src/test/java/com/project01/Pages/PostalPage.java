package com.project01.Pages;

import com.project01.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostalPage extends BasePage {

    public PostalPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[data-test=\"firstName\"]")
    private WebElement firstName ;

    @FindBy(css = "[data-test=\"lastName\"]")
    private WebElement lastName;

    @FindBy(css = "[data-test=\"postalCode\"]")
    private WebElement postalCode ;

    @FindBy(css = "[data-test=\"continue\"]")
    private WebElement continueBtn;

    @FindBy(css ="[data-test=\"finish\"]" )
    private WebElement finishBtn;



    public PostalPage setPostalInfo(String firstname , String lastname , String code) throws InterruptedException {
        firstName.sendKeys(firstname);
        Thread.sleep(1500);
        lastName.sendKeys(lastname);
        Thread.sleep(1500);
        postalCode.sendKeys(code);
        Thread.sleep(1500);
        continueBtn.click();
        Thread.sleep(1500);
        return this ;
    }

    public void clickFinishBtn() throws InterruptedException {
        Thread.sleep(1500);
        finishBtn.click();
    }


    public PostalPage sleep() throws InterruptedException {
        Thread.sleep(1500);
        return this ;
    }




























}
