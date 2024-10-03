package com.project01.Pages;

import com.project01.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddToCartSectionPage extends BasePage {

    public AddToCartSectionPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(css = "[data-test=\"shopping-cart-link\"")
    private WebElement cartLink;




    public AddToCartSectionPage addItems() throws InterruptedException {
        List<WebElement> listo = driver.findElements(By.xpath("//div[@data-test=\"inventory-item\"]"));
        System.out.println(listo.size());

        for (WebElement item : listo) {
            // Replace 'desired-item-condition' with your actual condition
//            System.out.println(item.getText());
//            if(item.isDisplayed()){
//                Assert.assertTrue(item.isDisplayed(),"go";)
////            }
            if (item.getText().contains("$")) {
                // Find and click the "Add to Cart" button
                WebElement addToCartButton = item.findElement(By.cssSelector("[class=\"btn btn_primary btn_small btn_inventory \"]"));
                addToCartButton.click();
            }
            Thread.sleep(1500);


        }
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
