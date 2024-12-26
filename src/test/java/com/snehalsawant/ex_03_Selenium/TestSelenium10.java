package com.snehalsawant.ex_03_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium10 {

    public void test_Selenium10()  {

        ChromeDriver driver = new ChromeDriver();
        //driver = new FirefoxDriver();

        WebDriver driver1 = new ChromeDriver();
        driver1 = new FirefoxDriver();
    }
}

