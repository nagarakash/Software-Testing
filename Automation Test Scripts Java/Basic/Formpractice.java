package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Webdriver.DriverConnection;

public class Formpractice {
public static void main(String[] args) {
	String url = "https://cosmocode.io/automation-practice-webtable/";
	WebDriver driver = DriverConnection.getDriver(url);
	
	List<WebElement>thead = driver.findElements(By.xpath("//table[@id=\"countries\"]/tbody/tr[1]/td"));
	for(WebElement e:thead) {
		System.out.print(e.getText()+ " | ");;
		
	}
	System.out.println();
	//table Data
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"countries\"]/tbody/tr"));
	 System.out.println(rows.size()); // for row size
	for(int i=2; i<=rows.size(); i++) {
		List<WebElement>cols = driver.findElements(By.xpath("//table[@id=\"countries\"]/tbody/tr["+i+"]/td"));
		for(int j=1; j<=cols.size(); j++) {
			List<WebElement>data = driver.findElements(By.xpath("//table[@id=\"countries\"]/tbody/tr["+i+"]/td["+j+"]"));
			
			for(WebElement e:data) {
				System.out.print(e.getText()+ " | ");
			}
		}
		System.out.println();
	}
}
}
//  ("//table[@id="countries"]/tbody/tr[78]/td[4]")
//table[@id="countries"]/tbody/tr[78]/td[4]