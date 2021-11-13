package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropdownTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1() {
        driver.get("http://practice.cybertekschool.com/dropdown");
        //1.locate your drtopdown just like any other web element with unique locator

        WebElement dropDownElement = driver.findElement(By.id("state"));

        //2. create select object by passing that element as a constructor


        Select stateDropdown = new Select(dropDownElement);


// get option methodu tum web elementinin listesini cikaracak bize

        List<WebElement> options = stateDropdown.getOptions();


        // 39. satiri pratik yapabilmek icin alt+enter diyoruz sonra list seciyoruz

        // sonra sectigimiz dropdown buttonunda kac senegimiz oldugunu gorebilmek icin size() methodunu kullanicaz

        System.out.println("options.size() = " + options.size());// options.size().soutv
        for (WebElement option : options) {
            System.out.println("option.getText() = " + option.getText());

        }

    }
    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropDownElement = driver.findElement(By.id("state"));
        Select stateDropdown = new Select(dropDownElement);

        // verify that first selection is Select a state
        String expectedOption = "Select a State";
        String actualOption = stateDropdown.getFirstSelectedOption().getText();
    Assert.assertEquals(expectedOption,actualOption,"verify first selection");

    //how to select options from dropdown?
        //1. select using visible text

        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Virginia");
        expectedOption="Virginia";
        actualOption =stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"verify first selection");
  // 2. select using by index
        Thread.sleep(2000);
        stateDropdown.selectByIndex(51);
        expectedOption="Wyoming";
        actualOption=stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"Verify first selection");


        //3.SELECT BY VALUE
        Thread.sleep(2000);
        stateDropdown.selectByValue("TX");

        expectedOption="Texas";
        actualOption=stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"Verify first selection");



    }

}