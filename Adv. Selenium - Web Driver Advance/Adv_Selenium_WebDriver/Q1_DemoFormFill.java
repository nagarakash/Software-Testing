package Adv_Selenium_WebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Webdriver.DriverConnection;


public class Q1_DemoFormFill {
	public static void main(String[] args) throws InterruptedException, IOException {
		
    String url = "https://demoqa.com/automation-practice-form";
    WebDriver driver = DriverConnection.getDriver(url);
		
		
    WebElement firstName = driver.findElement(By.id("firstName"));
    firstName.sendKeys("Akash");
    WebElement lastName = driver.findElement(By.id("lastName"));
    lastName.sendKeys("Nagar");
    WebElement email = driver.findElement(By.id("userEmail"));
    email.sendKeys("akash.nagar@petpooja.com");


    WebElement genderRadio = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
    genderRadio.click();

    WebElement userNumber = driver.findElement(By.id("userNumber"));
    userNumber.sendKeys("8153854671");
    
    
    WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
    dob.sendKeys(Keys.CONTROL + "a");
    dob.sendKeys("05 Dec 1996");
    dob.sendKeys(Keys.ENTER);

    WebElement subject = driver.findElement(By.id("subjectsInput"));
    subject.sendKeys("Computer Science");
    subject.sendKeys(Keys.ENTER);
    
    WebElement hobby = driver.findElement(By.xpath("//label[text()='Reading']"));
    hobby.click();

    WebElement upload = driver.findElement(By.id("uploadPicture"));
    upload.sendKeys("C:\\My\\SCREENSHOT");
    
    WebElement address = driver.findElement(By.id("currentAddress"));
    address.sendKeys("Delhi NCR");

    WebElement state = driver.findElement(By.id("react-select-3-input"));
    state.sendKeys("NCR");
    state.sendKeys(Keys.ENTER);

    WebElement city = driver.findElement(By.id("react-select-4-input"));
    city.sendKeys("Delhi");
    city.sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    
    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screenshot, new File("filled_form_screenshot.png"));

    System.out.println("Form filled and screenshot taken successfully!");

    
    WebElement submitButton = driver.findElement(By.id("submit"));
    submitButton.click();

    Thread.sleep(5000);

    driver.quit();
}
}