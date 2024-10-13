package rahulshettyacademy.Tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.TestComponents.Retry;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.CheckoutPage;
import rahulshettyacademy.pageobjects.ConfirmationPage;
import rahulshettyacademy.pageobjects.LandingPage;
import rahulshettyacademy.pageobjects.ProductCatalogue;

public class ErrorValidationsTest extends BaseTest {

	@Test(groups= {"ErrorHandling"},retryAnalyzer=Retry.class)
	public void LoginErrorValidation() throws IOException, InterruptedException {

		String productName = "ZARA COAT 3";

	    landingPage.loginApplication("ivanco@gmail.com", "Selenium1!1");

		Assert.assertEquals("Incorrect email  password.", landingPage.getErrorMessage());
	}
	
	@Test

	public void ProductErrorValidation() throws IOException, InterruptedException {

		String productName = "ZARA COAT 3";

		ProductCatalogue productCatalogue = landingPage.loginApplication("ivanco@gmail.com", "Selenium1!");

		List<WebElement> products = productCatalogue.getProductList();

		productCatalogue.addProductToCart(productName);
		CartPage cartPage = productCatalogue.goToPageCart();

		Boolean match = cartPage.VerifyProductDisplay("ZARA COAT 33");

		Assert.assertFalse(match);
		

	}

}
