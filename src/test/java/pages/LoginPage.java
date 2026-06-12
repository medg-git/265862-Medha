package pages;

import org.openqa.selenium.*;

public class LoginPage {

    WebDriver driver;

    By loginLink = By.linkText("Log in");
    By email = By.id("Email");
    By password = By.id("Password");
    By loginBtn = By.cssSelector("input[value='Log in']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass) {
        try {
            driver.findElement(loginLink).click();
            driver.findElement(email).sendKeys(user);
            driver.findElement(password).sendKeys(pass);
            driver.findElement(loginBtn).click();
        } catch (Exception e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
}