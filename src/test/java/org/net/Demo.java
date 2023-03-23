package org.net;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.FileAssert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

public class Demo {



//    @Test
//   void hai(){
////        String a ="C:\\Users\\a842074\\Downloads\\conductor-master\\Testng\\src\\test\\resources\\input.json";
//        File file = new File("C:\\Users\\a842074\\Downloads\\conductor-master\\Testng\\src\\test\\resources\\input.json");
//
//        RestAssured.baseURI ="https://rahulshettyacademy.com";
//        Response response = RestAssured.given().header("Content-Type","application/json")
//                .body(file).when().post("/Library/Addbook.php").then().extract().response();
//
//
//        System.out.println(response.getBody().asString());
//
//    }
  /*  @Test
        void demo() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://demo.guru99.com/test/web-table-element.php#");
           List<WebElement> row = driver.findElements(By.tagName("tr"));
            System.out.println(row.size());

            for(int i=0; i<row.size();i++) {//row1
    //            System.out.println(row.get(i).getText());
                List<WebElement> data = row.get(i).findElements(By.tagName("td"));
                for (int j=0;j<data.size();j++){
                  if(data.get(j).getText().trim().contains("Ltd")){
                      System.out.println("row" + i +"col"+ j);
                    driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td["+j+"]"));

                             System.out.println(data.get(j).getText());
                  }

                }
            }
            driver.quit();
        }*/
}
