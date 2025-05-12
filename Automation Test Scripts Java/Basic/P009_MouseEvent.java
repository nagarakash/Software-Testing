package Basic;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Webdriver.DriverConnection;

public class P009_MouseEvent {

	public static void main(String[] args) {
		
		String url = "https://www.amazon.in/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		//WebElement fresh = driver.findElement(By.linkText("Fresh"));
		WebElement mx = driver.findElement(By.linkText("MX Player"));
		WebElement sell = driver.findElement(By.linkText("Sell"));
		WebElement bs = driver.findElement(By.linkText("Bestsellers"));
		
		Actions action = new Actions(driver);
	//	action.moveToElement(fresh).build().perform();
		action.moveToElement(mx).build().perform();
		action.moveToElement(sell).build().perform();
		action.moveToElement(bs).build().perform();
		bs.click();
	}
}
