package com.cybertek.tests.day9_waits;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitExample {
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
    public void test1() throws InterruptedException{
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

    WebElement usernameInput=driver.findElement(By.id("username"));
    //HOW TO WAIT EWPLICITLY?
    // CREATE EXPILICIT WAIT OBJECT
    WebDriverWait wait = new WebDriverWait(driver,10);

wait.until(ExpectedConditions.visibilityOf(usernameInput));


    usernameInput.sendKeys("gorunur bekleme");



}
    @Test
    public void test2() throws InterruptedException{


        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        //click enable
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();

        //findingInput
        WebElement inputBox =driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));
//burasini eklemek cok onemli bunu eklemeyince input veriyi girmiyor
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(inputBox));

        inputBox.sendKeys("bariz bekleme");

    }



}
