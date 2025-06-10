package AssignmentTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import P06_DriverConnection.DriverConnection;



public class Q1_FBLoginTestNG {

    WebDriver driver;
    String url = "https://www.facebook.com/";

    @BeforeClass
    public void setUp() {

        driver = DriverConnection.getDriver(url);
    }

    @Test
    public void loginTest() throws InterruptedException {

        driver.findElement(By.id("email")).sendKeys("nagarakashkumar67@gmail.com");

        driver.findElement(By.id("pass")).sendKeys("8866146757");

        driver.findElement(By.name("login")).click();

        Thread.sleep(5000);

    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}