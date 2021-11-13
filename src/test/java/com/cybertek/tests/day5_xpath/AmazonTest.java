package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

    /**
     * TASK
     * go to amazon.com
     * search for selenium
     * click search button
     * verify 1-48 of 304 result for "selenium"
     *
     */

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        WebElement searchBox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
searchBox.sendKeys("Selenium");
//click search box
        driver.findElement(By.xpath("//input [@value='Go']")).click();
WebElement result= driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
String resultText = result.getText();
        System.out.println("resultText= " + resultText);


    }
}
