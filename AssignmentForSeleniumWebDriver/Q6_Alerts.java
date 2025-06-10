package AssignmentForSeleniumWebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Webdriver.DriverConnection;

public class Q6_Alerts {

    public static void main(String[] args) throws InterruptedException {
        
        String url = "https://demo.automationtesting.in/Alerts.html";
        WebDriver driver = DriverConnection.getDriver(url);
        driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
        Thread.sleep(1000); // wait for alert to appear
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println("Simple Alert text: " + simpleAlert.getText());
        simpleAlert.accept(); 

        driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
        driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
        Thread.sleep(1000);
        Alert confirmAlert = driver.switchTo().alert();
        System.out.println("Confirmation Alert text: " + confirmAlert.getText());
        confirmAlert.dismiss();  

        driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
        driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
        Thread.sleep(1000);
        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Prompt Alert text: " + promptAlert.getText());
        promptAlert.sendKeys("Hey AKASH!"); 
        promptAlert.accept();  
        
        Thread.sleep(2000); 
        driver.quit();
    }
}