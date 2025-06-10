package AssignmentTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import P06_DriverConnection.DriverConnection;

import org.testng.annotations.AfterTest;

public class Q2_GmailLoginTestNG {
    
    WebDriver driver;
    String url = "https://accounts.google.com/";

    @BeforeTest
    public void setup() {
        driver = DriverConnection.getDriver(url);
        System.out.println("Browser launched and navigated to Gmail login");
    }

    @Test
    public void loginTest() throws InterruptedException {
        System.out.println("Starting Gmail login test...");

        driver.findElement(By.id("identifierId")).sendKeys("your_email@gmail.com");
        driver.findElement(By.id("identifierNext")).click();

        Thread.sleep(10000); 

        driver.findElement(By.name("password")).sendKeys("your_password");
        driver.findElement(By.id("passwordNext")).click();

        Thread.sleep(5000); 
    }

    @AfterTest
    public void teardown() {
        driver.quit();
        System.out.println("🧹 Browser closed");
    }
}