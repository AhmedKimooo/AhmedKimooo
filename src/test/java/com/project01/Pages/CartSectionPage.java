package com.project01.Pages;

import com.project01.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartSectionPage  extends BasePage {


    public CartSectionPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "[data-test=\"continue-shopping\"]")
    private WebElement continueBtn ;

    @FindBy(css = "[data-test=\"shopping-cart-link\"]")
    private WebElement cartLink;

    @FindBy(css = "[data-test=\"remove-sauce-labs-onesie\"]")
    private WebElement removeBtn ;

    @FindBy(css ="[data-test=\"checkout\"]" )
    private WebElement checkOutBtn ;




    public  CartSectionPage clickContinueBtn() throws InterruptedException {
        Thread.sleep(1500);
        continueBtn.click();
        return this ;
    }
    public  CartSectionPage clickCartLink() throws InterruptedException {
        Thread.sleep(1500);
        cartLink.click();
        return this;
    }
    public CartSectionPage clickRemoveBtn() throws InterruptedException {
        Thread.sleep(1500);
        removeBtn.click();
        return this;
    }


    public PostalPage clickCheckOutBtn() throws InterruptedException {
        Thread.sleep(1500);
        checkOutBtn.click();
        return new PostalPage(driver);
    }

    public CartSectionPage sleep() throws InterruptedException {
        Thread.sleep(1500);
        return this ;
    }









}
