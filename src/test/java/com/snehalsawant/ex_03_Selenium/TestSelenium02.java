package com.snehalsawant.ex_03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium02 {


    @Description("Open the App.vwo.com and get the title")
        @Test
        public void test_Selenium02() {

            // Selenium 3
            // You need to set up the Driver(browser)
            //System.getProperty("webdriver.gecko.driver","/path/geckdriver")

            //Selenium 4
            //Selenium Manager - utility - Which can download the driver automatically
            // Start and stop itself

            EdgeDriver driver = new EdgeDriver();
            driver.get("http://google.com");



        }}

