package com.snehalsawant.ex_03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium04 {
    @Description("Open the App.vwo.com and get the title")
    @Test
    public void test_Selenium04(){

        WebDriver driver = new EdgeDriver();
        driver.get("http://app.vwo.com");



    }

}
