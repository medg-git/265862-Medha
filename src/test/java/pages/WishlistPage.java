package pages;

import org.openqa.selenium.*;

public class WishlistPage {

    WebDriver driver;

    By addToWishlist = By.cssSelector("input[value='Add to wishlist']");
    By wishlistLink = By.className("wishlist-label");

    public WishlistPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToWishlist() {
        try {
            driver.findElement(addToWishlist).click();
        } catch (Exception e) {
            System.out.println("Wishlist error: " + e.getMessage());
        }
    }

    public void openWishlist() {
        driver.findElement(wishlistLink).click();
    }
}