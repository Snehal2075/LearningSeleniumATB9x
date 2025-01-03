package com.snehalsawant.ex_05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium14 {
   @Description("Verify that with invalid email, pass, error message is shown in app.vwo.com")
    @Test
    public void test_Negative_vwologin() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");

        // 1. Find the email input box and enter the email

       //<input   -- open HTML tag
       // type="email"     -- key == value (attributes)
       // class="text-input W(100%)"
       // name="username"
       // id="login-username"
       // data-qa="hocewoqisi" data-gtm-form-interact-field-id="1"> -- close HTML tag

       WebElement emailInputBox = driver.findElement(By.id("login-username"));
       emailInputBox.sendKeys("admin@admin.com");

       // 2. Find the password input box and enter the password

       //<input type="password"
       // class="text-input W(100%)"
       // name="password"
       // id="login-password"
       // data-qa="jobodapuxe" data-gtm-form-interact-field-id="0">

       WebElement passwordInputBox = driver.findElement(By.name("password"));
       passwordInputBox.sendKeys("password123");

       //3. Find the submit button and click on it
      // <button type="submit"
       // id="js-login-btn"
       // class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)"
       // onclick="login.login(event)" data-qa="sibequkica">

       WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
       buttonSubmit.click();

       Thread.sleep(3000);


       // Find the invalid error message and verify

       //<div class="notification-box-description"
       // id="js-notification-box-msg"
       // data-qa="rixawilomi">Your email, password, IP address or location did not match</div>

       WebElement error_message = driver.findElement(By.className("notification-box-description"));

       Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");










     Thread.sleep(15000);
     driver.quit();

    }


}
