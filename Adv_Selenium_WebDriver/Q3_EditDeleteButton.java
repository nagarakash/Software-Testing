package Adv_Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Webdriver.DriverConnection;


public class Q3_EditDeleteButton {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/webtables";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement editBtn = driver.findElement(By.id("edit-record-1"));
		editBtn.click();
		Thread.sleep(1000);

        // Clear and update the salary field
        WebElement salaryField = driver.findElement(By.id("salary"));
        salaryField.clear();
        salaryField.sendKeys("15000");


        WebElement submitBtn = driver.findElement(By.id("submit"));
        submitBtn.click();


        Thread.sleep(1000);
        WebElement deleteBtn = driver.findElement(By.id("delete-record-2"));
        deleteBtn.click();


        Thread.sleep(2000);
        driver.quit();
    }
}
