package com.cybertek.tests.day7_testng;

import org.testng.annotations.*;

public class BeforeAfterMethod {
@BeforeClass
public void setUpClass(){
    System.out.println("--Before CLASS---");
    System.out.println("executed  one time before the class");
}
    @Test
    public void test1(){

        System.out.println("First Test Case");
    }
    @BeforeMethod
    public void setUp(){
        System.out.println("Webdriver ,opening Browser");
    }


    @AfterMethod
    public void teardown(){

        System.out.println("closing browser,quit");
    }
@AfterClass
    public void teardownclass(){

    System.out.println("---AFTER CLASS---");
    System.out.println("Some Reportting Code Here");
}
}
