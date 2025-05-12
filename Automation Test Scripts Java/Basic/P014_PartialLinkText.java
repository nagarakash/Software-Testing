package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Webdriver.DriverConnection;

public class P014_PartialLinkText {

	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);

		List<WebElement> links = driver.findElements(By.partialLinkText("Create"));

		System.out.println(links.size());
		for (WebElement e : links) {
			System.out.println(e.getText());
		}
		links.get(1).click();
	
		driver.navigate().back();
		
		
	}
}
