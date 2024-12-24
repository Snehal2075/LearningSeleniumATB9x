package com.snehalsawant.ex_01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {
@Description("Open the App.vwo.com and get the title")
 @Test
public void test_Selenium01(){

     //Open a URL
     // Print the title
     EdgeDriver driver = new EdgeDriver();
     driver.get("https://app.vwo.com");
     System.out.println(driver.getTitle());

}
}
