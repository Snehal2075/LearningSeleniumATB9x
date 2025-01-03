package com.snehalsawant.Task30122024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task {
   @Description("Verify the current URL")
    @Test
    public void task_URL() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // 1. Click on make appointment button

      //<a id="btn-make-appointment"
       // href="./profile.php#login"
       // class="btn btn-dark btn-lg">Make Appointment</a>

       WebElement make_appointment = driver.findElement(By.id("btn-make-appointment" ));
       make_appointment.click();

       // 2. Enter the Login creds and submit click

        // Enter Username
       WebElement UsernameInputBox = driver.findElement(By.name("username"));
       UsernameInputBox.sendKeys("John Doe");


       // Enter password
       WebElement passwordInputBox = driver.findElement(By.name("password"));
       passwordInputBox.sendKeys("ThisIsNotAPassword");

       Thread.sleep(3000);

       // Click on login
       // Enter password
       WebElement clickon_Login = driver.findElement(By.id("btn-login"));
       clickon_Login.click();

       // 3. Verify the current URL == https://katalon-demo-cura.herokuapp.com/#appointment

       String currentURL = driver.getCurrentUrl();
       Assert.assertEquals(currentURL,"https://katalon-demo-cura.herokuapp.com/#appointment");





       Thread.sleep(5000);
     driver.quit();

    }


}
