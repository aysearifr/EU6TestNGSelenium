package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {
    @Test
    public void test1(){
WebDriver driver= WebDriverFactory.getDriver("chrome");
driver.get("http://practice.cybertekschool.com/radio_buttons");
WebElement blueRadioButton=driver.findElement(By.id("blue"));
    blueRadioButton.getAttribute("value");

    //get value of type attribute
        System.out.println(blueRadioButton.getAttribute("type"));
      //get value of type name
        System.out.println(blueRadioButton.getAttribute("name"));
        //get value of type checked
        //since checked attribute does not keep any value,it will return true or false based on
        System.out.println(blueRadioButton.getAttribute("checked"));


        //trying to get attribute does not exist
        //when we use non exist attribute it will return null to us
        System.out.println(blueRadioButton.getAttribute("href"));

        System.out.println(blueRadioButton.getAttribute("outerHTML"));
        System.out.println("================================");
        System.out.println(blueRadioButton.getAttribute("innerHTML"));




        driver.quit();


    }
}
