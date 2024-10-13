package Section5_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.getProperty("webdriver.chrome.driver", "C:\\Users\\ivanc\\Downloads\\chromedriver_win32.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com/");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
