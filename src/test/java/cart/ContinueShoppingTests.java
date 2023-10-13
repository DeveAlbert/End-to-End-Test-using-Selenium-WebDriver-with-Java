package cart;

import base.BaseTests;
import org.saucedemo.com.pages.Cart;
import org.saucedemo.com.pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContinueShoppingTests extends BaseTests {
    @Test
    public void testSuccessfulContinueShopping() {
        homePage.enterUsername("standard_user");
        homePage.enterPassword("secret_sauce");
        InventoryPage inventoryPage = homePage.clickLogin();
        inventoryPage.addSauceLabsBoltTshirtToCart();
        inventoryPage.addSauceLabsFleeceJacketToCart();
        Cart cart = inventoryPage.goToCart();
        InventoryPage backToinventoryPage = cart.continueShopping();

        Assert.assertTrue(backToinventoryPage.getInventoryPageLogo());
    }

}
