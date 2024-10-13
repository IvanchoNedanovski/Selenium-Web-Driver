import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetGeoLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ivanc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // za da gi koristime chrome dev tools mora klasata CHromeDriver da ja
													// koriste ne web driver

		DevTools devTools = driver.getDevTools(); // vaka se kreira objekt na deevtools
		devTools.createSession();

		Map<String, Object> coordinates = new HashMap<String, Object>();
		coordinates.put("latitude", 40);
		coordinates.put("longitude", 3);
		coordinates.put("accuracy", 1);

		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);

		// send command to CDP Methods -> CDP Methods will invoke get access to chrome
		// dev tools
		// devTools.send(Emulation.setGeolocationOverride(Optional.of(52.520008),Optional.of(13.404954),Optional.of(1)));
		driver.get("http:google.com");

		driver.findElement(By.name("q")).sendKeys("netflix", Keys.ENTER);
		driver.findElement(By.cssSelector(".LC20lb")).click();

		String title = driver.findElement(By.cssSelector(".default-ltr-cache-19f4kxn")).getText();
		System.out.println(title);

	}

}
