package org.net;


import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WaitConcept {
//
//        @Test
//    void  asswe(){
//
//
//            SoftAssert softAssert = new SoftAssert();
//            softAssert.assertEquals("a","b","Must match actual and expected");
//            System.out.println("a");
////            Assert.assertEquals("a","b","c");
//            System.out.println("b");
//            System.out.println("c");
//            softAssert.assertAll();
//
//        }
//
//    @Test
//    void  ass1we(){
//
//
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals("a","a","Must match actual and expected");
//        System.out.println("a1");
////        Assert.assertEquals("a","b","c");
//        System.out.println("b1");
//        System.out.println("c1");
//
//    }



//@Test
//    void Fluenwait1(){
//    WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    driver.get("https://in.bookmyshow.com/explore/movies-chennai");
//
//
//    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).
//            withTimeout(Duration.ofSeconds(15)).
//            pollingEvery(Duration.ofSeconds(5)).
//            ignoring(Exception.class);
//    WebElement fluent = wait.until(new Function<WebDriver, WebElement>() {
//        @Override
//        public WebElement apply(WebDriver webDriver) {
//            return driver.findElement(By.xpath("(//div[text()='Tamil'])[2]"));
//        }
//    });
//
//    driver.findElement(By.xpath("(//div[text()='Tamil'])[2]")).click();
//
//    WebElement fluent1 = wait.until(webDriver -> driver.findElement(By.xpath("//img[@alt='Vaathi']")));
//    driver.findElement(By.xpath("//img[@alt='Vaathi']")).click();
//
//
//}





//    @Test
//    void Webdrivewait1(){
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//      driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//try {
//    driver.findElement(By.xpath("//buton[contains(text(),'Click for JS Alert')]")).click();
//    wait.until(ExpectedConditions.alertIsPresent());
//    Alert alert = driver.switchTo().alert();
//    String text = alert.getText();
//    System.out.println(text);
//    alert.accept();
//    String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
//    System.out.println(result);
//}catch (Exception e){
//    System.out.println(e.getMessage());
//    System.out.println("Alert is not present");
//}
//    }



//    @Test
//    public void wait1() throws Exception {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.agoda.com/en-in/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
////        Thread.sleep(3000);
//        driver.findElement(By.xpath("//div[@class='Box-sc-kv6pi1-0 ejwhzN']")).click();
//         driver.findElement(By.xpath("//button[@class='Buttonstyled__ButtonStyled-sc-5gjk6l-0 brUBl']//span[text()='Sign in']")).click();
////        Thread.sleep(3000);
//        WebElement frame = driver.findElement(By.xpath("//Iframe[@title='Universal login']"));
////        Thread.sleep(3000);
//        driver.switchTo().frame(frame);
////        Thread.sleep(3000);
//        driver.findElement(By.xpath("\t\t//span[text()='Create account']")).click();
////        Thread.sleep(3000);
//        driver.findElement(By.id("firstName")).sendKeys("selenium");
//
//
//    }
}
