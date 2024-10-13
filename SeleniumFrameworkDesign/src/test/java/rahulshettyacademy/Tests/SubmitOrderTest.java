package rahulshettyacademy.Tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.CheckoutPage;
import rahulshettyacademy.pageobjects.ConfirmationPage;
import rahulshettyacademy.pageobjects.LandingPage;
import rahulshettyacademy.pageobjects.OrderPage;
import rahulshettyacademy.pageobjects.ProductCatalogue;

public class SubmitOrderTest extends BaseTest {

	
	String productName = "ZARA COAT 3";
	
	@Test(dataProvider = "getData",groups ={"Purchase"})
	public void submitOrder(HashMap<String, String> input) throws IOException, InterruptedException {

		

		ProductCatalogue productCatalogue = landingPage.loginApplication(input.get("email"), input.get("password"));

		List<WebElement> products = productCatalogue.getProductList();

		productCatalogue.addProductToCart(productName);

		CartPage cartPage = productCatalogue.goToPageCart();

		Boolean match = cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		CheckoutPage checkoutPage = cartPage.goToCheckout();
		checkoutPage.selectCountry("india");

		ConfirmationPage confirmationPage = checkoutPage.submitOrder();

		String confirmMessage = confirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));

	}
	
	@Test(dependsOnMethods = {"submitOrder"})
	
	public void OrderHistoryTest()
	{
		ProductCatalogue productCatalogue = landingPage.loginApplication("ivanco@gmail.com", "Selenium1!");
	OrderPage ordersPage=	productCatalogue.goToOrdersPage();
	Assert.assertTrue(ordersPage.VerifyOrderDisplay(productName));
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
//		HashMap<String, String> map =new HashMap<String, String>();
//		map.put("email", "ivanco@gmail.com");
//		map.put("password", "Selenium1!");
//		map.put("productName", "ZARA COAT 3");
//		
//		HashMap<String, String> map1 =new HashMap<String, String>();
//		map1.put("email", "kire@gmail.com");
//		map1.put("password", "Selenium1!");
//		map1.put("productName", "ADIDAS ORIGINAL");
//		
//	return new Object[][] {{map},{map1}};
		
		List<HashMap<String,String>> data =	getJsonDataToMap("C://Users//ivanc//Desktop//selenium//SeleniumFrameworkDesign//src//test//java//rahulshettyacademy//data//PurchaseOrder.json");
		return new Object [] [] {{data.get(0)}, {data.get(1)} };
	}
	
	
	
	
	
	
//	@DataProvider  // so ovaj metod treba gore vo glavnio metod da se deklarirat tipoj na podatocite so ke gi zemi od tuka 
//	public Object[][] getData()
//	{
//		return new Object [] [] {{"ivanco@gmail.com", "Selenium1!", "ZARA COAT 3" } , {"kire@gmail.com", "Selenium1!", "ADIDAS ORIGINAL"}};
//	}
	
	
	
	
	
	
	
	

}
