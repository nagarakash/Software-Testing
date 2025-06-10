package AssignmentForSeleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Webdriver.DriverConnection;



public class Q1_LinkTextPartialLink {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";

		WebDriver driver = DriverConnection.getDriver(url);

		List<WebElement> links = driver.findElements(By.partialLinkText("Create"));
		List<WebElement> link = driver.findElements(By.linkText("Log in"));

		System.out.println(link.size());
		for (WebElement e : link) {
			System.out.println(e.getText());
		}
		
		System.out.println(links.size());
		for (WebElement e : links) {
			System.out.println(e.getText());
		}
		
		links.get(1).click();
		
		
		driver.navigate().back();
	}
}
