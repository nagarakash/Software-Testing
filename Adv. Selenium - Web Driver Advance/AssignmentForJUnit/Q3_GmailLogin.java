package AssignmentForJUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Webdriver.DriverConnection;



public class Q3_GmailLogin {

    private WebDriver driver;
    private String url = "https://accounts.google.com/signin";

    @Before
    public void setUp() {

        driver = DriverConnection.getDriver(url);
    }

    @Test
    public void testGmailLogin() throws InterruptedException {

        WebElement emailInput = driver.findElement(By.id("identifierId"));
        emailInput.sendKeys("nagarakashkumar@gmail.com");

        WebElement nextButton = driver.findElement(By.id("identifierNext"));
        nextButton.click();

        Thread.sleep(10000);

        WebElement passwordInput = driver.findElement(By.name("Passwd"));
        passwordInput.sendKeys("nagar67");

        WebElement passwordNext = driver.findElement(By.id("passwordNext"));
        passwordNext.click();

        Thread.sleep(5000);

        String currentUrl = driver.getCurrentUrl();
        assertTrue("Login failed or inbox not loaded", currentUrl.contains("mail.google.com/mail"));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}