package com.snehalsawant.ex_05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium15 {
   @Description("Verify that with invalid email, pass, error message is shown in app.vwo.com")
    @Test
    public void test_Negative_vwologin() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");

        //<a
       // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
       // class="text-link" data-qa="bericafeqo">
       // Start a free trial</a>

       //Full text
      // WebElement a_tag_free_trail = driver.findElement(By.linkText("Start a free trial"));
      // a_tag_free_trail.click();

       //partial text

       WebElement a_tag_free_trail = driver.findElement(By.linkText("free trial"));
       a_tag_free_trail.click();

       // For partial text we can use eg. a free trail , trail, start etc.




       Thread.sleep(5000);
     driver.quit();

    }


}
