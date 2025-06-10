package AssignmentTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import P06_DriverConnection.DriverConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Q4_FacebookLoginTest {

    WebDriver driver;

    @Test
    @Parameters({"url", "email", "password"})
    public void loginToFacebook(String url, String email, String password) {

        // Get the WebDriver from your DriverConnection class
        driver = DriverConnection.getDriver(url);

        // Maximize window
        driver.manage().window().maximize();

        // Facebook login steps
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.name("login")).click();

        // You can add assertions here to verify login if needed
        System.out.println("Login attempted with email: " + email);
    }
}
