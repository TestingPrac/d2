package org.net;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class W1t {

@Test
    public void b() {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://in.bookmyshow.com/explore/movies-chennai");

    }




    @Test
    public void a() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://in.bookmyshow.com/explore/movies-chennai");


        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement fluent = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.xpath("(//div[text()='Tamil'])[2]"));
            }
        });
        driver.findElement(By.xpath("(//div[text()='Tamil'])[2]")).click();

        WebElement fluent1 = wait.until(webDriver -> driver.findElement(By.xpath("//img[@alt='Vaathi']")));

        driver.findElement(By.xpath("//img[@alt='Vaathi']")).click();


//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//
//
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
//            wait.until(ExpectedConditions.alertIsPresent());
//            Alert alert = driver.switchTo().alert();
//            String a =alert.getText();
//            System.out.println(a);
//            alert.accept();
//
////            String text1 = driver.findElement(By.cssSelector("#result")).getText();
//            String text1 = driver.findElement(By.xpath("//p[@id='result']")).getText();
//            System.out.println(text1);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            System.out.println("Alert is not Present");
//            driver.navigate().refresh();
//
//        }

       /* WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.agoda.com/en-in/");
        driver.findElement(By.xpath("//div[@class='Box-sc-kv6pi1-0 ejwhzN']")).click();
        driver.findElement(By.xpath("//button[@class='Buttonstyled__ButtonStyled-sc-5gjk6l-0 brUBl']//span[text()='Sign in']")).click();
//        WebElement f = driver.findElement(By.xpath("//input[@id='firstName']"));
        WebElement f = driver.findElement(By.xpath("//Iframe[@title='Universal login']"));
        Thread.sleep(3000);
        driver.switchTo().frame(f);

        driver.findElement(By.xpath("//span[text()='Create account']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("firstName")).sendKeys("selenium");
//        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("asdfgj");*/
//    }


//
//    @Test
//    void  BrowserLan(){
//         driver = new ChromeDriver();
////         driver.get("");
//
//    }


//    @Test
//    void Demo(){
//        try
//
//        {
//
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//            driver.findElement(By.xpath("//button[@id='alertBox']")).click();
//            wait.until(ExpectedConditions.alertIsPresent());
//            System.out.println("Alert present");
//            Alert alert = driver.switchTo().alert();
//            alert.accept();
//        } catch(
//                Exception var4)
//
//        {
//            System.out.println(var4.getMessage());
//            System.out.println("HI");
//            driver.navigate().refresh();
//        }
//    }


    }
}
