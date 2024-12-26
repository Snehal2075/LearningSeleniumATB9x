package com.snehalsawant.ex_03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium06 {
    @Description("Open the URL")
    @Test
    public void test_Selenium06(){

        WebDriver driver = new EdgeDriver();
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());


    }}
