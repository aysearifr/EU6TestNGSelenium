package com.cybertek.tests.day10_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FilePathExample {
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
    public void test1(){
        //  /Users/sametari/IdeaProjects/EU5TestNGSelenium/src/test/resources/textfile.txt
//  /Users/sametari/IdeaProjects/EU5TestNGSelenium   ---> bu kisim dinamik kisim sabit degil herkesde baska
        //Fakat github da paylasirken dinamik path a ihtiyacimiz var. yani yazdigimiz kod  herkesde calisabilmeli
//kullandigimiz sistemin ne oldugunu gosteren kod
        System.out.println(System.getProperty("os.name"));
        //Mac OS X


        System.out.println(System.getProperty("user.dir"));
        ///Users/sametari/IdeaProjects/EU5TestNGSelenium


        String  projectPath =System.getProperty("user.dir");
        String  filePath = "src/test/resources/textfile.txt";
        String fullPath = projectPath+"/"+filePath;
        // fullPath kodu --->bu sayede herkesin bilgisayarinda dogru calisacak dinamik kodu elde etmis oluyoruz




    }

}
