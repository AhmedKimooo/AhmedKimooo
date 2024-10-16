package com.project01.testcases;

import com.project01.Driver.DriverFactory;
import com.project01.Pages.AddToCartSectionPage;
import com.project01.Pages.LoginPage;
import com.project01.base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AddToCartSectionTest  extends BaseTest {


//  @Test
//    public  void  shouldAddToCart() throws InterruptedException {
//     LoginPage loginPage = new LoginPage(driver);
//
//      // add to cart section
//            loginPage
//              .load()
//              .login("standard_user","secret_sauce")
//              .addItems()
//                    .CartLingBtn();
//
//
//  }

    @Test
    public  void  shouldAddToCartBug() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

        // add to cart section
        loginPage
                .load()
                .login("error_user","secret_sauce")
                .addItems()
                .CartLingBtn();


    }

    @Test
    public  void  shouldAddToCartBug1() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

        // add to cart section
        loginPage
                .load()
                .login("problem_user","secret_sauce")
                .addItems()
                .removeItems()
                .CartLingBtn();


    }

    @Test
    public  void  performance()  {
        //driver config
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        //login page
        driver.findElement(By.cssSelector("[placeholder=\"Username\"]")).sendKeys("performance_glitch_user");
        driver.findElement(By.cssSelector("[placeholder=\"Password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();

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


        }

    }







}
