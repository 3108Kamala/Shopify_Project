package java.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static WebDriver driver;
    public static void main(String[] args) {
        try {
            driver= new ChromeDriver();
            driver.get("https://www.shopify.com/");
            driver.findElement(By.xpath(("//a[text()=\"Log in\"]"))).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("suresh.m@foodhub.com");
            Thread.sleep(2000);
            driver.findElement(By.name("commit")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(("//input[@type=\"password\"]"))).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Foodhub@2024");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(5000);
           driver.findElement(By.xpath("//span[text()='Products']")).click();
           Thread.sleep(2000);
           driver.findElement(By.xpath("//span[text()=\"Add product\"]")).click();
           Thread.sleep(2000);
           driver.findElement(By.name("title")).click();
           driver.findElement(By.name("title")).sendKeys("White Tshirt");
           driver.findElement(By.name("price")).click();
           driver.findElement(By.name("price")).sendKeys("2.00");

//            driver.findElement(By.className("Polaris-Navigation__ItemInnerWrapper Polaris-Navigation__ItemInnerWrapper--selected")).click();
        }catch (Exception e){
            e.getMessage();
   }
//        finally {
//            driver.quit();
//        }
    }
}