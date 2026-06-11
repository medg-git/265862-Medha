package Assignments_02_05_2026;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open webpage
        driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
    }

    @Test (priority = 2, groups = { "regression", "frames"})
    public void handleIframeAndGetText() {
    	
    	    	// Switch to Frame 1
    	        // Frame can be located using index, name, or WebElement
    	        driver.switchTo().frame(0); // First iframe

    	        // Get text inside the frame
    	        String frameText = driver.findElement(By.xpath("//h1")).getText();

    	        // Print text
    	        System.out.println("Text inside Frame 1: " + frameText);

    	        // Switch back to main page
    	        driver.switchTo().defaultContent();

    	        System.out.println("Successfully handled iframe");
    	    }

    	    @AfterMethod
    	    public void tearDown() {
    	        driver.quit();
    	    }
}

   

