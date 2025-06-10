package AssignmentForSeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Webdriver.DriverConnection;

import java.util.List;

public class Q4_RadioButtonDropDown {

    public static void main(String[] args) throws InterruptedException {
        String url = "https://demo.automationtesting.in/Register.html";

        WebDriver driver = DriverConnection.getDriver(url);

        driver.manage().window().maximize();

        Thread.sleep(2000);

        List<WebElement> genderRadios = driver.findElements(By.name("radiooptions"));

        for (WebElement radio : genderRadios) {
            radio.click();
            System.out.println("Selected Gender: " + radio.getAttribute("value"));
            Thread.sleep(1000); // So you can visually see the selection
        }

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Akash Kumar");

        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Nagar");

        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Ahmedabad");

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nagarakashkumar67@gmail.com");

        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8866146757");

        driver.findElement(By.xpath("//input[@value='Male']")).click();

        driver.findElement(By.id("checkbox1")).click(); // Cricket
        driver.findElement(By.id("checkbox2")).click(); // Movies

        driver.findElement(By.id("msdd")).click();
        driver.findElement(By.xpath("//a[text()='English']")).click();
        driver.findElement(By.xpath("//body")).click(); // click elsewhere to close dropdown

        WebElement skillsDropdown = driver.findElement(By.id("Skills"));
        skillsDropdown.sendKeys("Java"); 

        WebElement countryDropdown = driver.findElement(By.id("countries"));
        countryDropdown.sendKeys("India");

        driver.findElement(By.xpath("//span[@role='combobox']")).click();
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("India");
        driver.findElement(By.xpath("//li[text()='India']")).click();

        driver.findElement(By.id("yearbox")).sendKeys("1990");
        driver.findElement(By.xpath("//select[@placeholder='Month']")).sendKeys("December");
        driver.findElement(By.id("daybox")).sendKeys("5");

        driver.findElement(By.id("firstpassword")).sendKeys("Test@1234");
        driver.findElement(By.id("secondpassword")).sendKeys("Test@1234");

        driver.findElement(By.id("submitbtn")).click();

        System.out.println("Form submitted successfully!");

        Thread.sleep(3000);
        driver.quit();
    }
}