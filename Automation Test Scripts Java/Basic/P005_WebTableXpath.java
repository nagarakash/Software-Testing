package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Webdriver.DriverConnection;

public class P005_WebTableXpath {
	public static void main(String[] args) {
		
		String url = "https://cosmocode.io/automation-practice-webtable/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		//Fetch header 
		List<WebElement> heads = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td/h3/strong"));
		for(WebElement e:heads) {
			System.out.print(e.getText()+" | ");
		}
		System.out.println();
	
		
		//Table Data
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
		
		for(int i=2; i<=rows.size(); i++) {
			List<WebElement> cols = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td"));
			
			for(int j=2; j<=cols.size(); j++) {
				List<WebElement>data = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td["+j+"]"));
				
				for(WebElement e:data) {
					System.out.print(e.getText()+" | ");
				}
			}
			System.out.println();
		}
		}
	}
		
	


