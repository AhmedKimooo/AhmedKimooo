package com.project01.testcases;

import com.project01.Driver.DriverFactory;
import com.project01.Pages.AddToCartSectionPage;
import com.project01.Pages.CartSectionPage;
import com.project01.Pages.LoginPage;
import com.project01.Pages.PostalPage;
import com.project01.base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PostalCheckTest extends BaseTest {

    @Test

    public void isPostalWorking() throws InterruptedException {
        //driver config


        //login page
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login("standard_user","secret_sauce")
                .sleep()
                .addItems()
                .sleep()
                .CartLingBtn()
                .sleep()
                .clickContinueBtn()
                .sleep()
                .clickCartLink()
                .sleep()
                .clickRemoveBtn()
                .sleep()
                .clickCheckOutBtn()
                .sleep()
                .setPostalInfo("ahmed ","ahmed" ,"3335")
                .sleep()
                .clickFinishBtn();






        // add to cart section

        //cart Section

        //postal check


        //finish










    }






}
