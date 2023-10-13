package login;

import base.BaseTests;
import org.saucedemo.com.pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin() {
        homePage.enterUsername("standard_user");
        homePage.enterPassword("secret_sauce");
        InventoryPage inventoryPage = homePage.clickLogin();

        Assert.assertTrue(inventoryPage.getInventoryPageLogo());
    }
    @Test
    public void testSuccessfulLogout() {
        homePage.enterUsername("standard_user");
        homePage.enterPassword("secret_sauce");
        InventoryPage inventoryPage = homePage.clickLogin();
        homePage.clickBurgerMenu();
        homePage = homePage.clickLogoutBtn();

        Assert.assertTrue(homePage.getLogoutBanner());
    }
}
