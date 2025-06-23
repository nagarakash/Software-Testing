package AppiumAssessmnet;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class InstagramLogin {
	static AppiumDriver driver=null;
	public static void main(String[] args) throws InterruptedException
	{
		try {
			openInstagramApp();
		} catch (MalformedURLException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());	
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void openInstagramApp() throws MalformedURLException, InterruptedException 
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("appium:deviceName", "vivo 1917"); 
		cap.setCapability("appium:udid", "62ac4605"); 
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:platformVersion", "11");
		cap.setCapability("appium:appPackage", "com.instagram.android"); 
		cap.setCapability("appium:appActivity", "com.instagram.mainactivity.LauncherActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
       Thread.sleep(7000);
       
       System.out.println("Instagram Launched");

       driver = new AppiumDriver(url, cap);
       Thread.sleep(10000);
       System.out.println("On Login Page");
       
		driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"com.instagram.android:id/layout_container_main\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")).sendKeys("akash_nagar7");
	    System.out.println("Username Entered");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"com.instagram.android:id/layout_container_main\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText")).sendKeys("Aakash@67");
	    System.out.println("Password Entered");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Log in\"]/android.view.ViewGroup")).click();
	    Thread.sleep(10000);
	    //for saving Login Info
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Save']/android.view.ViewGroup")).click();

	    
		System.out.println("On Homepage");

		
		driver.close();


       
	        
	 }
}	
