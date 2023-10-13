package org.saucedemo.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class InventoryPage {
    private By inventoryPageLogo = By.xpath("//span[@class='title']");
    private By sauceLabsFleeceJacketBtn = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private By SauceLabsBoltTshirtBtn = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By cartBtn = By.className("shopping_cart_link");

    private WebDriver driver;
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }
    public Boolean getInventoryPageLogo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='title']")))
                .isDisplayed();
    }
    public void addSauceLabsFleeceJacketToCart() {
        driver.findElement(sauceLabsFleeceJacketBtn).click();
    }
    public void addSauceLabsBoltTshirtToCart() {
        driver.findElement(SauceLabsBoltTshirtBtn).click();
    }
    public Cart goToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.className("shopping_cart_link")))
                .click();
        return new Cart(driver);
    }
    public void removeSauceLabsFleeceJacketFromCart() {

    }
    public void removeSauceLabsBoltTshirtFromCart() {

    }

}

