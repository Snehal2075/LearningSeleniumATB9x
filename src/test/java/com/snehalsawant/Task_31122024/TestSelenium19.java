package com.snehalsawant.Task_31122024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium19 {

@Description ("Verify that the free trial message is visible")
@Test
    public void test_free_trail_message_on_IDrive() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");


        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");

        Thread.sleep(3000);

        //1. Enter email ID

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("augtest_040823@idrive.com");


        // 2. Enter password

        WebElement password_input = driver.findElement(By.xpath("//input[@id='password']"));
        password_input.sendKeys("123456");

        //3. Click on Sign In

        WebElement click_on_signIn = driver.findElement(By.xpath("//button[@id='frm-btn']"));
        click_on_signIn.click();

        //4.Verify the message "Your free trial has expired"

        Thread.sleep(15000);
        WebElement title = driver.findElement(By.xpath("//div//h5[text()='Your free trial has expired']"));
        Assert.assertEquals(title.getText(),"Your free trial has expired");
        System.out.println("You are all set to proceed");




        Thread.sleep(3000);
        driver.quit();
        // It will close all the tabs. - session id == null
    }}