package gotocart;

import base.BaseTests;
import org.saucedemo.com.pages.Cart;
import org.saucedemo.com.pages.HomePage;
import org.saucedemo.com.pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VisitToCartPageTests extends BaseTests {
    @Test
    public void testSuccessfulVisitToCartPage() {
        homePage.enterUsername("standard_user");
        homePage.enterPassword("secret_sauce");
        InventoryPage inventoryPage = homePage.clickLogin();
        Cart cart = inventoryPage.goToCart();
        Assert.assertTrue(cart.getCartPageTitle());
    }
}
