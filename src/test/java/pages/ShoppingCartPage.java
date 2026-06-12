package pages;

import org.openqa.selenium.*;

public class ShoppingCartPage {

    WebDriver driver;

    By addToCart = By.cssSelector("input[value='Add to cart']");
    By cartLink = By.className("cart-label");

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addItemToCart() {
        try {
            driver.findElement(addToCart).click();
        } catch (Exception e) {
            System.out.println("Add to cart error: " + e.getMessage());
        }
    }

    public void openCart() {
        driver.findElement(cartLink).click();
    }
}