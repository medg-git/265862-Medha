package Assignments_01_06_2026;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

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

        // Navigate to application
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void validLoginTest() {

        // Enter Username
}
}