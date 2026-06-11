package Assignments_02_05_2026;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setup() {

        // Setup driver
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
    }

    @Test (priority = 1, groups = {"smoke","alerts"})
    public void handleAlerts() throws InterruptedException {

        // Simple Alert
        driver.findElement(By.xpath("//button[text()='Alert']")).click();

        Alert simpleAlert = driver.switchTo().alert();
        System.out.println("Simple Alert Text: " + simpleAlert.getText());
        simpleAlert.accept(); // Click OK

        Thread.sleep(1000);

        // Confirmation Alert
        driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();

        Alert confirmAlert = driver.switchTo().alert();
        System.out.println("Confirm Alert Text: " + confirmAlert.getText());
        confirmAlert.dismiss(); // Click Cancel

        Thread.sleep(1000);

        // Prompt Alert
        driver.findElement(By.xpath("//button[text()='Prompt']")).click();

        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Prompt Alert Text: " + promptAlert.getText());

        promptAlert.sendKeys("Hello Medha"); // Enter text
        promptAlert.accept(); // Click OK

        System.out.println("All alerts handled successfully");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}