package org.saucedemo.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutFirstStepPage {
    private WebDriver driver;
    private By checkoutFirstStepPageLogo = By.className("header_secondary_container");
    public CheckoutFirstStepPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean getCheckoutFirstStepPageLogo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.elementToBeClickable(checkoutFirstStepPageLogo))
                .isDisplayed();
    }
}
