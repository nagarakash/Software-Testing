package Adv_Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Q4_LoginTest {
    public static void main(String[] args) {
    	
        WebDriver driver = new ChromeDriver();

        try {

            driver.get("http://www.demo.guru99.com/V4/");
            driver.manage().window().maximize();


            WebElement userField = driver.findElement(By.name("uid"));
            WebElement passField = driver.findElement(By.name("password"));

            userField.sendKeys("mngr622010");
            passField.sendKeys("dajerYj");


            WebElement loginButton = driver.findElement(By.name("btnLogin"));
            loginButton.click();


            String expectedTitle = "Guru99 Bank Manager HomePage";
            String actualTitle = driver.getTitle();

            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Login successful. Test Passed.");
            } else {
                System.out.println("Login failed. Test Failed.");
                takeScreenshot(driver, "login_failed.png");
            }

        } catch (Exception e) {
            System.out.println("⚠️ Test threw an exception: " + e.getMessage());
            takeScreenshot(driver, "login_exception.png");
        } finally {
            driver.quit();
        }
    }

    private static void takeScreenshot(WebDriver driver, String fileName) {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(src.toPath(), Paths.get(fileName));
            System.out.println("Screenshot saved as: " + fileName);
        } catch (Exception e) {
            System.out.println("Could not take screenshot: " + e.getMessage());
        }
    }
}
