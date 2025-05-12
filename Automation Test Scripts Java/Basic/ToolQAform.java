package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Webdriver.DriverConnection;

public class ToolQAform {
	public static void main(String[] args) {
		String url = "https://demoqa.com/automation-practice-form";
	WebDriver driver = DriverConnection.getDriver(url);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement firstname = driver.findElement(By.id("firstName"));
	firstname.sendKeys("Akash");
	
	WebElement nextname = driver.findElement(By.id("lastName"));
	nextname.sendKeys("Kumar");
	
	WebElement Email = driver.findElement(By.id("userEmail"));
	Email.sendKeys("akash.nagar@gmail.com");
	
	//List<WebElement>list = driver.findElements(By.id("gender-radio-2"));
	//System.out.println(list.size());
	//list.get(1).click();
	
	WebElement Mobile = driver.findElement(By.id("userNumber"));
	Mobile.sendKeys("1234567890");
	
	WebElement DOB = driver.findElement(By.id("dateOfBirthInput"));
	DOB.sendKeys("08 Apr 2025");
	
	WebElement Subject = driver.findElement(By.id("subjectsContainer"));
	Subject.sendKeys("TESTING");
	
	WebElement Hobbies1 = driver.findElement(By.id("hobbies-checkbox-1"));
	WebElement Hobbies2 = driver.findElement(By.id("hobbies-checkbox-2"));
	WebElement Hobbies3 = driver.findElement(By.id("hobbies-checkbox-3"));
	//System.out.println(list.size());
	
	
	WebElement Picture = driver.findElement(By.id("uploadPicture"));
	Picture.sendKeys("Games");
	
	WebElement Address = driver.findElement(By.id("Current Address"));
	Address.sendKeys("Ahmedabad");
	
	WebElement State = driver.findElement(By.id("state"));
	State.sendKeys("Gujarat");
	
	WebElement City = driver.findElement(By.id("city"));
	City.sendKeys("Ahmedabad");
	
	WebElement Submit = driver.findElement(By.linkText("submit"));
	Submit.click();
	
	}	 
	 
	
	
		
	}


