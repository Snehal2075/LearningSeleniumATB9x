package com.snehalsawant.ex_03_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium11 {

@Test
    public void test_Selenium11() {

    WebDriver driver = new EdgeDriver();   // 95% of time we will use this
    driver.get("http://google.com");

    // Use navigation methods
    driver.navigate().to("https://bing.com");
    driver.navigate().back();
    driver.navigate().forward();
    driver.navigate().refresh();


}
}

