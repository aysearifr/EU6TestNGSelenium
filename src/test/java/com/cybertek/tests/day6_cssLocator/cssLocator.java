package com.cybertek.tests.day6_cssLocator;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;

public class cssLocator {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement dontClick = driver.findElement(By.id("dissapearing_buttonasdasd"));
        System.out.println("dontClick = " + dontClick.getText());
        driver.quit();
    }
}
