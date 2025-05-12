package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P001_BrowserConnection {
	public static void main(String[] args) throws InterruptedException {
		// 1.chrome driver
		String url = "https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();

		// 2.edge driver
		String url1 = "https://www.facebook.com/";
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();
		driver1.get(url1);
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		driver1.close();

		// 3.firefox driver
		String url2 = "https://www.facebook.com/";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.36.0-win64\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		driver1.get(url1);
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		driver1.close();

	}
}