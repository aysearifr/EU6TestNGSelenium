package com.cybertek.tests.day10_actions_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsTest {

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
    public  void  hoverTest() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");

        WebElement img1=driver.findElement(By.tagName("img"));
        //Actions --->ontains all the user interactions
        // how to create actions object--> passing driver as a contructor


        Actions actions =new Actions(driver);
        //perform() --->perform the action, complete the action

        Thread.sleep(2000);
        actions.moveToElement(img1).perform();

        WebElement viewLink = driver.findElement(By.partialLinkText("View profile"));

Assert.assertTrue(viewLink.isDisplayed(),"verify view Link is displayed");


    }
    @Test
    public void  dragAndDrop() throws InterruptedException {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();


        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));
        actions.dragAndDrop(source,target).perform();
//bu haliyle test basari ile gecti
        //bazi durumlarda cookies accept etmek gerekiyor. Bu durumda
        //cookiesin accept buttonu lacate edilir ve clickedilir
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();




    }
    @Test
    public void dragAndDropChaining() throws  InterruptedException{
// drag anad drop olmadan  da bunu yapabiliriz bunu nasil yapacagimizi yazacagiz

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);

        actions.moveToElement(source).clickAndHold().moveToElement(target).release().perform();




    }

}
