package com.snehalsawant.ex_03_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium13 {

@Test
    public void test_Selenium13() {

    WebDriver driver = new EdgeDriver();
    driver.get("https://google.com");

    // Close - will close the current tab, not the session
    // session id != null

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    driver.close();




    //Quit - It will close all the tabs
    // session id == null
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    driver.quit();





    }}

