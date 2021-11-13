package com.cybertek.tests.day3_webelement_intro;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class cookies {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://google.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='jyfHyd'])[2]")).click();
        Thread.sleep(5000);
    }
}
