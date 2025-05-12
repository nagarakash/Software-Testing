package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Webdriver.DriverConnection;

public class P008_IFrame {
public static void main(String[] args) throws InterruptedException {
	
	String url = "https://demoqa.com/frames";
	WebDriver driver = DriverConnection.getDriver(url);
	
	//iframe1
	WebElement iframe1 = driver.findElement(By.id("frame1"));
	driver.switchTo().frame(iframe1);
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.id("sampleHeading"));
	System.out.println(ele.getText());
	
	
	// back to main win
	String mainwin = driver.getWindowHandle();
	driver.switchTo().window(mainwin);
	Thread.sleep(3000);
	
	//iframe2
	WebElement iframe2 = driver.findElement(By.id("frame2"));
	driver.switchTo().frame(iframe2);
	Thread.sleep(3000);
	WebElement ele1 = driver.findElement(By.id("sampleHeading"));
	System.out.println(ele1.getText());
	
	
	

}
}
