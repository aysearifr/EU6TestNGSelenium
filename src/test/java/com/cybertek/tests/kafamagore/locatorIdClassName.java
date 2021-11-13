package com.cybertek.tests.kafamagore;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class locatorIdClassName {
    WebDriver driver= WebDriverFactory.getDriver("chrome");
    @BeforeMethod
    public void setup(){

        driver.get("https://www.amazon.fr/");


    }

   @AfterMethod
   public void teardown() throws InterruptedException {
        Thread.sleep(3000);

   }


@Test
            public void test1(){


        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hamac");

        driver.findElement(By.id("nav-search-submit-button")).click();
      driver.findElement(By.id("sp-cc-accept")).click();


    }









    }

