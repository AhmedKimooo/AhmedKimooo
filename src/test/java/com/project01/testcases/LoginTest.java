package com.project01.testcases;

import com.project01.Driver.DriverFactory;
import com.project01.Pages.LoginPage;
import com.project01.base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void isLoginPageWorking() throws InterruptedException {
        //driver config
        driver.get("https://www.saucedemo.com/");

        //login page
        LoginPage loginPage =new LoginPage(driver);
        loginPage.load().login("standard_user","secret_sauce ");

    }

    }













