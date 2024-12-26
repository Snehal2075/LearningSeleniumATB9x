package com.snehalsawant.ex_03_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium12 {

@Test
    public void test_Selenium11() {


    WebDriver driver = new ChromeDriver();
    // driver.get("google.com");
    driver.get("https://google.com");


}
}

