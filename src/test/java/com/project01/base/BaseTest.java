package com.project01.base;

import com.project01.Driver.DriverFactory;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;


    @BeforeMethod
    public void setup(){
        driver =new DriverFactory().driverInitialize();

    }


    @AfterMethod

    public void tearDown(){
        driver.quit();
    }













}
