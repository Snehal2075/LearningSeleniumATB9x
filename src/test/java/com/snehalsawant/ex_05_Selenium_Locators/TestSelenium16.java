package com.snehalsawant.ex_05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium16 {
   @Description("Verify that with invalid email, error message is shown in app.vwo.com/free-trail")
    @Test
    public void test_Negative_vwologin() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver();
        driver.get("https://vwo.com/free-trial");

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("123457889990");

       WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
       checkbox_policy.click();

       List<WebElement> buttonlist = driver.findElements(By.tagName("button"));
       buttonlist.get(0).click();

       //<div
       // class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">The email address you entered is incorrect.</div>

       WebElement error_message = driver.findElement(By.className("invalid-reason"));

       Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");





       Thread.sleep(5000);
     driver.quit();

    }


}
