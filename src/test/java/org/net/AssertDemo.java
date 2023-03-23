package org.net;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.lang.ref.SoftReference;
import java.util.List;

public class AssertDemo {
// Soft Assert
    @Test
void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
       List<WebElement> row= driver.findElements(By.tagName("tr"));
//        System.out.println(row.size());
        for(int i=0;i<row.size();i++){
//            System.out.println(row.get(i).getText());
            List<WebElement> data= driver.findElements(By.tagName("td"));
//            System.out.println(data.size());
        for(int j=0;j<data.size();j++){
            if(data.get(j).getText().equals("Repco Home Finance L")) {
                driver.findElement(By.xpath("//table[@class='dataTable']//tr[" + i + "]//td[" + j + "]/a"));
                System.out.println(data.get(j).getText());
            }
        }
        }
        driver.quit();
    }
}
