package AssignmentForSeleniumWebDriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Webdriver.DriverConnection;



public class Q3_AlertGenerate {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/alerts";
		WebDriver driver = DriverConnection.getDriver(url);
		
		//1.Click Button to see alert
//		WebElement btn1 = driver.findElement(By.id("alertButton"));
//		btn1.click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();
		
		//2.On button click, alert will appear after 5 seconds
		WebElement btn2 = driver.findElement(By.id("timerAlertButton"));
		btn2.click();
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();

		//3.On button click, confirm box will appear
//		WebElement btn3 = driver.findElement(By.id("confirmButton"));
//		btn3.click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.dismiss();
		
		//4.On button click, prompt box will appear
//		WebElement btn4 = driver.findElement(By.id("promtButton"));
//		btn4.click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.sendKeys("Hello Akash");
//		alert.accept();
	}
}
