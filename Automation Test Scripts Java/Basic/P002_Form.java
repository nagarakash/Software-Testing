package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Webdriver.DriverConnection;

public class P002_Form {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		WebElement ca = driver.findElement(By.linkText("Create new account"));
		ca.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Akash");
		
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys("Nagar");
		
		WebElement days = driver.findElement(By.id("day"));
		Select day = new Select(days);
		day.selectByIndex(15);
		
		WebElement months = driver.findElement(By.id("month"));
		Select month = new Select(months);
		month.selectByValue("11");
		
		WebElement years = driver.findElement(By.id("year"));
		Select year = new Select(years);
		year.selectByVisibleText("2007");
		
		List<WebElement> List = driver.findElements(By.id("sex"));
		System.out.println(List.size());
		List.get(1).click();
		
		WebElement Mobile = driver.findElement(By.name("reg_email__"));
		Mobile.sendKeys("8866146757");
		
		WebElement Pass = driver.findElement(By.name("reg_passwd__"));
		Pass.sendKeys("kumar");
		
		
	}

}
