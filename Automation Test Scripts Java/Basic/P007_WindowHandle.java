package Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Webdriver.DriverConnection;

public class P007_WindowHandle {
public static void main(String[] args) throws InterruptedException {
	
	String url = "https://demo.guru99.com/popup.php";
	WebDriver driver = DriverConnection.getDriver(url);
	
	WebElement Link = driver.findElement(By.linkText("Click Here")); 
	Link.click();
	
	String mainWin = driver.getWindowHandle();  // for first win
	Set<String> allWin = driver.getWindowHandles(); // for all/rest window
	
	for(String w : allWin) {   // to fetch mainwin // to check wind
		System.out.println(w);
		
		if(mainWin.equals(w)) {
			driver.switchTo().window(w);
			Thread.sleep(2000);
			driver.findElement(By.name("emailid")).sendKeys("Riyansh.nagar@gmail.com");
			driver.findElement(By.name("btnLogin")).click();
			Thread.sleep(2000); // add wait time to see the results
		}
	}
	driver.quit(); // to close all windows
	//driver.close(); // to close current tabs
}
}
