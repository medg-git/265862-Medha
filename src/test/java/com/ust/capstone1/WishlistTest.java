package com.ust.capstone1;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.*;

public class WishlistTest extends BaseTest {

    @Test
    public void positive_AddToWishlist() {

        // Login to application
        LoginPage login = new LoginPage(driver);
        login.login("standardtest@test.com", "Password123");

        // Navigate to Books page
        HomePage home = new HomePage(driver);
        home.clickBooks();

        // Use WishlistPage (NOT WishlistTest)
        WishlistPage wish = new WishlistPage(driver);
        wish.addToWishlist();
        wish.openWishlist();
    }

    @Test
    public void negative_OpenEmptyWishlist() {

        // Use WishlistPage (NOT WishlistTest)
        WishlistPage wish = new WishlistPage(driver);
        wish.openWishlist(); // no items
    }
}