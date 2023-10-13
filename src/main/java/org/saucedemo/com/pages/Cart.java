package org.saucedemo.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class Cart {
    private WebDriver driver;
    private By cartPageTitle = By.xpath("//span[@class='title']");
    private By sauceLabsBoltTshirtDetails = By.id("item_1_title_link");
    private By sauceLabsFleeceJacketDetails = By.id("item_5_title_link");
    private By checkoutBtn = By.id("checkout");
    private By continueShoppingBtn = By.id("continue-shopping");
    public Cart(WebDriver driver) {
        this.driver = driver;
    }
    public Boolean getCartPageTitle() {
        return driver.findElement(cartPageTitle).isDisplayed();
    }
    public String getSauceLabsBoltTshirtDetails() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.elementToBeClickable(sauceLabsBoltTshirtDetails)).getText();
    }
    public String getSauceLabsFleeceJacketDetails() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.elementToBeClickable(sauceLabsFleeceJacketDetails)).getText();
    }
    public InventoryPage continueShopping() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(continueShoppingBtn))
                .click();
        return new InventoryPage(driver);
    }
    public CheckoutFirstStepPage checkout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn))
                .click();
        return new CheckoutFirstStepPage(driver);
    }

}
