package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
driver.navigate().to("https://www.facebook.com");
sleep(3000);



//tekrar geri google a gitmesi icin back metodu kullaniliyor
driver.navigate().back();

        sleep(2000);


        driver.navigate().forward();

        sleep(2000);
        driver.navigate().refresh();

    }
}
