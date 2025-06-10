package AssignmentTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import P06_DriverConnection.DriverConnection;



public class Q3_DataProvider {

    @DataProvider(name = "fbLoginData")
    public Object[][] getLoginData() {
        return new Object[][]{
            {"akash@example.com", "password123"},
            {"kumar@example.com", "pass777"},
            {"nagar@fb.com", "letsme999"}
        };
    }

    @Test(dataProvider = "fbLoginData")
    public void loginTest(String username, String password) {
        System.out.println("Testing login with:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        
        String url = "https://www.facebook.com/login/";
        WebDriver driver = DriverConnection.getDriver(url);
         driver.get("https://www.facebook.com");

         driver.findElement(By.id("email")).sendKeys(username);
         
         driver.findElement(By.id("pass")).sendKeys(password);
         
         driver.findElement(By.name("login")).click();

        // Just simulating output for now.
        System.out.println("Login test executed!\n");
    }
}