package cart;

import base.BaseTests;
import org.saucedemo.com.pages.Cart;
import org.saucedemo.com.pages.CheckoutFirstStepPage;
import org.saucedemo.com.pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutFirstStepPageTests extends BaseTests {
    @Test
    public void testSuccessfulCheckout() {
        homePage.enterUsername("standard_user");
        homePage.enterPassword("secret_sauce");
        InventoryPage inventoryPage = homePage.clickLogin();
        inventoryPage.addSauceLabsBoltTshirtToCart();
        inventoryPage.addSauceLabsFleeceJacketToCart();
        Cart cart = inventoryPage.goToCart();
        CheckoutFirstStepPage checkoutFirstStepPage = cart.checkout();

        Assert.assertTrue(checkoutFirstStepPage.getCheckoutFirstStepPageLogo());
    }
}
