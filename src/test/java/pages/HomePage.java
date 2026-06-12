package pages;

import org.openqa.selenium.*;

public class HomePage {

    WebDriver driver;

    By booksMenu = By.linkText("Books");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBooks() {
        driver.findElement(booksMenu).click();
    }
}