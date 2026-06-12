package com.ust.capstone1;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.*;

public class ShoppingCartTest extends BaseTest {

    @Test
    public void positive_AddToCart() {
        LoginPage login = new LoginPage(driver);
        login.login("standardtest@test.com", "Password123");

        HomePage home = new HomePage(driver);
        home.clickBooks();

        ShoppingCartPage cart = new ShoppingCartPage(driver);
        cart.addItemToCart();
        cart.openCart();
    }

    @Test
    public void negative_AddEmptyCart() {
        ShoppingCartPage cart = new ShoppingCartPage(driver);
        cart.openCart(); // no items added
    }
}