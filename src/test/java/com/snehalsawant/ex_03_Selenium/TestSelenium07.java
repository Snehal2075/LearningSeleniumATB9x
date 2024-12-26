package com.snehalsawant.ex_03_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium07 {
    @Test
    public void test_Selenium07() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");


        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.manage().window().maximize();
        driver.manage().window().minimize();

    }}
