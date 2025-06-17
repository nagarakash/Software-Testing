
package AppiumAssessmnet;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollingEvent {
	static AppiumDriver driver=null;
	public static void main(String[] args) throws InterruptedException
	{
		try {
			openApiDemosApp();
		} catch (MalformedURLException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());	
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void openApiDemosApp() throws MalformedURLException, InterruptedException 
	{
		
		DesiredCapabilities cap = new  DesiredCapabilities();
		cap.setCapability("appium:deviceName", "Aakash"); 
		cap.setCapability("appium:udid", "62a1c362"); 
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:platformVersion", "13");
		cap.setCapability("appium:appPackage", "io.appium.android.apis"); 
		cap.setCapability("appium:appActivity", "io.appium.android.apis.ApiDemos");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver(url, cap);
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		Thread.sleep(1000);
		
	
		WebElement webViewOption = driver.findElement(AppiumBy.androidUIAutomator(
		  "new UiScrollable(new UiSelector().scrollable(true))" +
		  ".scrollIntoView(new UiSelector().text(\"WebView\"))"
		));

		webViewOption.click();

		driver.close();
	}
}
