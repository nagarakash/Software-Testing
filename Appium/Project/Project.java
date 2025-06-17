
package VideoPlayer;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Project {
	
	static AppiumDriver driver=null;
	public static void main(String[] args) throws InterruptedException
	{
		try {
			openArcPlayerApp();
		} catch (MalformedURLException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());	
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void openArcPlayerApp() throws MalformedURLException, InterruptedException 
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("appium:deviceName", "Aakash"); 
		cap.setCapability("appium:udid", "62a1c362"); 
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:platformVersion", "13");
		cap.setCapability("appium:appPackage", "com.videoplayer.arcplayer"); 
		cap.setCapability("appium:appActivity", "com.teeter.videoplayer.SplashActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
       Thread.sleep(7000);
       
       System.out.println("Arc Player Launched");

       driver = new AppiumDriver(url, cap);
       Thread.sleep(10000);
       System.out.println("On Homepage");
       
//       if video in folder and want to start directly
//       driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.videoplayer.arcplayer:id/list']/android.view.ViewGroup[2]")).click();
//       Thread.sleep(2000);
//       driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.videoplayer.arcplayer:id/list\"]/android.view.ViewGroup")).click();
//       System.out.println("Video Played Perfectly");

       
       
       //Play Video by Search
       driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.videoplayer.arcplayer:id/menuSearch']")).click();
       Thread.sleep(1000);
       
       driver.findElement(By.xpath("//android.widget.AutoCompleteTextView[@resource-id='com.videoplayer.arcplayer:id/search_src_text']")).sendKeys("Sapphire");
       Thread.sleep(1000);
       
       driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.videoplayer.arcplayer:id/list']/android.view.ViewGroup")).click();
       System.out.println("Video Played Perfectly");
       Thread.sleep(1000);
       
       driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.videoplayer.arcplayer:id/okBtn']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.videoplayer.arcplayer:id/okBtn']")).click();
       
       driver.findElement(By.xpath("//bf1")).click();

       driver.close();

	}
}
