package Section11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calendar_example_other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\ivanc\\Downloads\\chromedriver_win32.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();

		while (!driver.findElement(By.cssSelector("[class='ui-datepicker-title'] [class='ui-datepicker-month']"))
				.getText().contains("April"))
			;

		{
			driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
		}

		List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
		int count = driver.findElements(By.className("ui-state-default")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("ui-state-default")).get(i).click();
				break;
			}

		}

	}
}
