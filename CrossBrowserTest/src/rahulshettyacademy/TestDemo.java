package rahulshettyacademy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {
	@Test
	public void ttileCheck() throws MalformedURLException {

		MutableCapabilities caps = new MutableCapabilities();


		WebDriver driver = new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"), caps);
		driver.get("https://rahulshettyacademy.com/");
		Assert.assertTrue(driver.getTitle().matches("Rahul Shetty Academy"));;

	}

}
