package Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Webdriver.DriverConnection;

public class P006_Alert {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demoqa.com/alerts";    // main --1
		WebDriver driver = DriverConnection.getDriver(url);  // main --2
		
		// 1. Alert
//	WebElement btn1 = driver.findElement(By.id("alertButton"));
//	btn1.click();
//	Alert alert = driver.switchTo().alert();
//	Thread.sleep(3000)
//	alert.accept();
		
		//2.Alert
//		WebElement btn2 = driver.findElement(By.id("timerAlertButton"));
//		btn2.click();
//	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//	    wait.until(ExpectedConditions.alertIsPresent());
//	    Alert alert = driver.switchTo().alert();
//	    Thread.sleep(30); //
//	    alert.accept();
	    
		//3.Alert
//		WebElement btn3 = driver.findElement(By.id("confirmButton"));
//		btn3.click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(3000);
//		alert.dismiss();
 
		//4.Alert
		WebElement btn4 = driver.findElement(By.id("promtButton"));
		btn4.click();
		Alert alert = driver.switchTo().alert();
    	Thread.sleep(2000); 
		alert.sendKeys("Akash Nagar");
	    Thread.sleep(2000); 
		alert.accept();
	}
}
