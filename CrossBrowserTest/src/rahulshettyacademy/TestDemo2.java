package rahulshettyacademy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo2 {
	
	@Test
	public void ttileCheckGoogle() throws MalformedURLException
	{
		
		MutableCapabilities caps = new MutableCapabilities();
		WebDriver driver = new RemoteWebDriver(new URL("https://hub.browserStack.com/wd/hub"),caps);
		driver.get("https://google.com/");
		Assert.assertTrue(driver.getTitle().matches("Google"));
		
		
	}

}
