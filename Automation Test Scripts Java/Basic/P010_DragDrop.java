package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Webdriver.DriverConnection;

public class P010_DragDrop {
	public static void main(String[] args) {
		
		String url = "https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement iframe = driver.findElement(By.xpath("//div[@rel-title='Photo Manager']/p/iframe"));
		
		driver.switchTo().frame(iframe);
		
		WebElement img1 = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]/img"));
		WebElement img2 = driver.findElement(By.xpath("//ul[@id='gallery']/li[2]/img"));
		WebElement trash = driver.findElement(By.id("trash"));
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(img1).moveToElement(trash).build().perform();
		action.clickAndHold(img2).moveToElement(trash).build().perform();
		
		
	
		
}

}
