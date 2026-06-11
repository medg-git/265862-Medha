package Assignments_02_05_2026;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the URL
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }

    @Test (priority = 3, groups = {"sanity","dropdowns"})
    public void selectDropdownOption() {

        //Locate dropdown element
        WebElement dropdown = driver.findElement(By.id("dropdown"));

        //Create Select object
        Select select = new Select(dropdown);

        //Select Option 1 (visible text method)
        select.selectByVisibleText("Option 1");

        //Validation
        WebElement selectedOption = select.getFirstSelectedOption();
        String selectedText = selectedOption.getText();

        Assert.assertEquals(selectedText, "Option 1",
                "Dropdown selection failed!");
        
    }
}

