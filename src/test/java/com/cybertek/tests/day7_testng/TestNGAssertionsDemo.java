package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class TestNGAssertionsDemo {
    @Test
  public void  test1(){
        System.out.println("First assertion");
        Assert.assertEquals("title","title");

        System.out.println("Second assertion");
        Assert.assertEquals("url","url");

    }
    @Test
    public void test2(){


        Assert.assertEquals("test2","test2");

    }
    @Test
    public void test3(){

        String expectedTitle="Cyb";
        String actualTitle="Cybertek";

        Assert.assertTrue(actualTitle.startsWith(expectedTitle),"Verify title starts with Cyb");




    }
    @Test
    public void  test4(){
        //verify email contains @ sign

    String email ="mikesmith.com";
    Assert.assertTrue(email.contains("@"),"verify email contains @");
    }
    @Test
    public void  test5(){
        Assert.assertFalse(0>1,"verify that 0 is not greater than 1");
    }





    @AfterMethod
    public void  teardown(){
    System.out.println("Close browser");

}
}
