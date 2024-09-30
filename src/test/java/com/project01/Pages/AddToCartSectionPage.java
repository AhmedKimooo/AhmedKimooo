package com.project01.Pages;

import com.project01.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartSectionPage extends BasePage {

    public AddToCartSectionPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "[data-test=\"add-to-cart-sauce-labs-backpack\"]")
    private WebElement AddItem1;
    @FindBy(css ="[data-test=\"add-to-cart-sauce-labs-bike-light\"]" )
    private WebElement AddItem2;
    @FindBy(css = "[data-test=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
    private WebElement AddItem3;
    @FindBy(css ="[data-test=\"add-to-cart-sauce-labs-fleece-jacket\"]" )
    private WebElement AddItem4;
    @FindBy(css = "[data-test=\"add-to-cart-sauce-labs-onesie\"]")
    private WebElement AddItem5;
    @FindBy(css = "[data-test=\"shopping-cart-link\"")
    private WebElement cartLink;




    public AddToCartSectionPage addItems() throws InterruptedException {
        AddItem1.click();
        Thread.sleep(1500);
        AddItem2.click();
        Thread.sleep(1500);
        AddItem3.click();
        Thread.sleep(1500);
        AddItem4.click();
        Thread.sleep(1500);
        AddItem5.click();
        Thread.sleep(1500);
        return this;

    }
    public CartSectionPage CartLingBtn() throws InterruptedException {
        Thread.sleep(1500);
        cartLink.click();
        return new CartSectionPage(driver);
    }

    public AddToCartSectionPage sleep() throws InterruptedException {
        Thread.sleep(1500);
        return this ;
    }







}
