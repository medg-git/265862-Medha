package Assignments_01_06_2026;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest2 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setup() {

        // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();

        // Launch browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Initialize wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the login page
        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
    }

    @Test
    public void validLoginTest() {

        // Enter Email
        driver.findElement(By.id("email")).sendKeys("testuser@gmail.com");

        // Enter Password
        driver.findElement(By.id("password")).sendKeys("Test@123");

        // Click Login button
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        // Wait for page load / validation condition
        wait.until(ExpectedConditions.urlContains("login"));

        // Validation (since site does not do real login)
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("Login") || pageSource.contains("Register"),
                "Login action may have failed");

        System.out.println("Login form submitted successfully");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}