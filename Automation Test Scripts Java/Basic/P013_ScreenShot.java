package Basic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Webdriver.DriverConnection;

public class P013_ScreenShot {

	public static void getScreenShot(WebDriver driver, String path) {
		
		TakesScreenshot ss =(TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		
		try {
			FileUtils.copyFile(source, dest);
			System.out.println("ss taken");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		String url = "https://www.google.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		getScreenShot(driver, "C:\\My\\SCREENSHOT\\google.png");
	}	
		
	
}




//public static void getScreenshot(WebDriver driver, String path) {
//	
//	TakesScreenshot ss = (TakesScreenshot) driver;
//	File source = ss.getScreenshotAs(OutputType.FILE);
//	File dest = new File(path);
//	
//	try {
//		FileUtils.copyFile(source, dest);
//		System.out.println("ss taken");
//	} 
//	catch (Exception e) {
//		e.printStackTrace();
//	}
//
//	public static void main(String[] args) {
//		String url = "https://www.google.com/";
//		WebDriver driver = DriverConnection.getDriver(url);
//
//		getScreenshot(driver, "C:\\My\\SCREENSHOT");