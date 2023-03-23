package org.net;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Listeners(ty.in.Listenerrr.class)
public class TestNG {

WebDriver driver;

    @Test
    public void TestToFail() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 1");
//        System.out.println("This method to test fail");
        Thread.sleep(345);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(false);
    }
    @Test
    public void TestToPass() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
                driver.findElement(By.name("uid"));

    }


}
