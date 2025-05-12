package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Webdriver.DriverConnection;

public class P011_Keyboard {
	public static void main(String[] args) {
		
		String url = "https://www.google.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement search = driver.findElement(By.name("q"));
		
		Actions action = new Actions(driver);
		
		action.click(search)
		.keyDown(Keys.LEFT_SHIFT)
		.sendKeys("Software testing")
		.pause(Duration.ofSeconds(5))
		.keyUp(Keys.LEFT_SHIFT)
		.keyDown(Keys.ARROW_DOWN)
		.keyDown(Keys.ENTER)
		.build().perform();
		
	}

}
