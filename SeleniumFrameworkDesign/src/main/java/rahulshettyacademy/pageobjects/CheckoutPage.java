package rahulshettyacademy.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class CheckoutPage extends AbstractComponent{
	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".action__submit")
	WebElement submit;

	@FindBy(css = "[placeholder='Select Country']")
	WebElement country;

	@FindBy(css = ".ta-item:nth-of-type(2)")
	WebElement selectCountry;

	By results = By.cssSelector(".ta-results");

	public void selectCountry(String CountryName) {

		Actions a = new Actions(driver);
		a.sendKeys(country, CountryName).build().perform();
		 waitForElementToAppear(By.cssSelector(".ta-results"));
		selectCountry.click();

	}
	
	public ConfirmationPage submitOrder() {
		
		submit.click();
		
	return	new ConfirmationPage(driver); 
		
		
		
	}


}
