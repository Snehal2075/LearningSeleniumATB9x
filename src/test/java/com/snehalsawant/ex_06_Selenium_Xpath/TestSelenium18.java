package com.snehalsawant.ex_06_Selenium_Xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium18 {
   @Description("Verify that with invalid email, error message is shown in app.vwo.com/free-trail")
    @Test
    public void test_Negative_vwologin() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement make_appointment_btn = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make_appointment_btn.click();

        


        





       Thread.sleep(5000);
     driver.quit();

    }


}
