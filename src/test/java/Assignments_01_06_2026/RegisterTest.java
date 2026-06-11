package Assignments_01_06_2026;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {

        // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();

        // Launch browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Initialize wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open application
        driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
    }

    @Test
    public void RegisterTest() {

        // Generate unique username
        String username = "user" + System.currentTimeMillis();
    }
}


