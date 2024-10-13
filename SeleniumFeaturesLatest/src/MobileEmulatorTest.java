import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v114.emulation.Emulation;




public class MobileEmulatorTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ivanc\\Downloads\\chromedriver_win32\\chromedriver.exe");

		
		ChromeDriver driver = new ChromeDriver(); // za da gi koristime chrome dev tools mora klasata CHromeDriver da ja
													// koriste ne web driver

		DevTools devTools = driver.getDevTools(); // vaka se kreira objekt na deevtools
		devTools.createSession();

		// send command to CDP Methods -> CDP Methods will invoke get access to chrome
		// dev tools
		devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(),
				Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
				Optional.empty(), Optional.empty()));
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Library")).click();// TODO Auto-generated method stub

	}

}
