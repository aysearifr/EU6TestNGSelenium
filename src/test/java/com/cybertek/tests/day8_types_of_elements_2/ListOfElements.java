package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListOfElements {

WebDriver driver;

@BeforeMethod
    public void  setUp(){
driver= WebDriverFactory.getDriver("chrome");

}
@AfterMethod
    public void tearDown() throws InterruptedException {
Thread.sleep(2000);
   driver.quit();
}

@Test
    public void test1(){
   driver.get("http://practice.cybertekschool.com/multiple_buttons");
    Assert.assertTrue(false);
}
}
