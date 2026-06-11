package LabSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class InvokeChrome {

    public static void main(String[] args) {

        // Setup ChromeDriver automatically (no manual download needed ✅)
        WebDriverManager.chromedriver().setup();

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        // Open any website
        driver.get("https://www.google.com");

        // Print title
        System.out.println("Page Title: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}