package com.project01.testcases;

import com.project01.Driver.DriverFactory;
import com.project01.Pages.AddToCartSectionPage;
import com.project01.Pages.CartSectionPage;
import com.project01.Pages.LoginPage;
import com.project01.base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class CartSectionTest extends BaseTest {

    @Test
    public void isCartSectionWork() throws InterruptedException {

        //driver config


        //login page
        LoginPage loginPage = new LoginPage(driver);
        loginPage
                .load()
                .login("standard_user","secret_sauce")
                .addItems()
                .CartLingBtn()
                .clickContinueBtn()
                .clickCartLink()
                .clickRemoveBtn()
                .clickCheckOutBtn();



        // add to cart section

        //cart Section


        //postal check







    }









}
