package Adv_Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Webdriver.DriverConnection;

import java.util.List;

public class Q2_TableVerify {

    public static void main(String[] args) {
    	String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.getDriver(url);
        try {

            Thread.sleep(1500); 

            WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table 2']"));

            List<WebElement> rows = table.findElements(By.xpath(".//tr[position() < last()]"));
            int structureRowCount = 0;
            for (WebElement row : rows) {
                List<WebElement> cells = row.findElements(By.tagName("td"));
                if (!cells.isEmpty()) {
                    structureRowCount++;
                }
            }
            System.out.println("Task 1 - Structure Count: " + (structureRowCount == 4 ? "PASS" : "FAIL"));

            
            WebElement sixthRow = table.findElement(By.xpath(".//tr[6]"));
            List<WebElement> sixthRowCells = sixthRow.findElements(By.tagName("td"));
            System.out.println("Task 2 - 6th Row Column Count: " + (sixthRowCells.size() == 2 ? "PASS" : "FAIL"));

            List<WebElement> heightCells = table.findElements(By.xpath(".//tr[position() < last()]/td[4]"));
            List<WebElement> structureCells = table.findElements(By.xpath(".//tr[position() < last()]/td[1]"));
            
            int maxHeight = 0;
            String tallestStructure = "";

            for (int i = 0; i < heightCells.size(); i++) {
                String heightText = heightCells.get(i).getText().replace("m", "").trim();
                int height = Integer.parseInt(heightText);
                if (height > maxHeight) {
                    maxHeight = height;
                    tallestStructure = structureCells.get(i).getText();
                }
            }

            System.out.println("Task 3 - Tallest Structure: " + tallestStructure + " (" + maxHeight + "m)");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}