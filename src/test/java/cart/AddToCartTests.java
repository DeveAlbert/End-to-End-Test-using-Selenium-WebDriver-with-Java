package cart;

import base.BaseTests;
import org.saucedemo.com.pages.Cart;
import org.saucedemo.com.pages.InventoryPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
public class AddToCartTests extends BaseTests {
    @Test
    public void testAddToCartFunctionality() {
        homePage.enterUsername("standard_user");
        homePage.enterPassword("secret_sauce");
        InventoryPage inventoryPage = homePage.clickLogin();
        inventoryPage.addSauceLabsBoltTshirtToCart();
        inventoryPage.addSauceLabsFleeceJacketToCart();
        Cart cart = inventoryPage.goToCart();

        assertEquals(cart.getSauceLabsBoltTshirtDetails(),"Sauce Labs Bolt T-Shirt");
        assertEquals(cart.getSauceLabsFleeceJacketDetails(),"Sauce Labs Fleece Jacket");
    }
}
