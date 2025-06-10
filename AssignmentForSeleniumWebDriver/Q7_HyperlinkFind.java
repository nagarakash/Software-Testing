package AssignmentForSeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Webdriver.DriverConnection;

import java.util.List;

public class Q7_HyperlinkFind {

    public static void main(String[] args) {

        String url = "https://qavbox.github.io/demo/webtable/";

        WebDriver driver = DriverConnection.getDriver(url);

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println("Total hyperlinks on the page: " + allLinks.size());

        
        for (WebElement link : allLinks) {
            String text = link.getText().trim();
            String href = link.getAttribute("href");
            System.out.println("Text: " + (text.isEmpty() ? "[No text]" : text) + " | URL: " + href);
        }

        driver.quit();
    }
}