package AssignmentForSeleniumWebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Webdriver.DriverConnection;

public class PharmEasy {
	public static void main(String[] args)  {
		
		String url = "https://pharmeasy.in/";
		WebDriver driver = DriverConnection.getDriver(url);
		
	    driver.manage().window().maximize();
	    
	 // Step 1: Click on banner (Healthcare UPTO 60% OFF)
	WebElement btn = driver.findElement(By.xpath("//img[@alt='Healthcare UPTO 60% OFF']"));
	btn.click();
	
	driver.manage().window().maximize();
	
	 // Step 2: Click on an item (first product shown)
	WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[1]/div[2]/div[2]/div/div/a[4]"));
	btn1.click();
	
	
	WebElement item = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/section[1]/div[2]/div[2]/div[1]/div[3]/a/div"));
	item.click();
	
	WebElement quantity = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[3]"));
	quantity.click();
	

	WebElement add = driver.findElement(By.xpath("//*[@id=\"proceed\"]"));
	add.click();
	
	
    
		
	}

}
