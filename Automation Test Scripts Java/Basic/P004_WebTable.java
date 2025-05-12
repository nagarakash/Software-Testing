package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Webdriver.DriverConnection;



public class P004_WebTable {
	public static void main(String[] args) {
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.getDriver(url);

		List<WebElement> thead = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th/span"));
		for(WebElement e:thead) {
			System.out.print(e.getText()+" | ");
		}
		System.out.println();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println(rows.size());
		for(int i=2;i<=rows.size();i++) {
			List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td"));
			for(int j=1;j<=cols.size();j++) {
				List<WebElement> data = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]"));
				for(WebElement text : data) {
					System.out.print(text.getText()+" | ");
				}
			}
			System.out.println();
		}
	}
}