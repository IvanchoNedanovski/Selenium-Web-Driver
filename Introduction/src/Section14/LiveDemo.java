package Section14;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\ivanc\\Downloads\\chromedriver_win32.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// click od coloum
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// capture all webelements into test
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));

		// capture text of all webelements into new(orginal)list
		List<String> orginalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());

		// sort on the orginal list od step 3->sorted list
		List<String> sortedList = orginalList.stream().sorted().collect(Collectors.toList());

		// compare orginal list vs sorted list

		Assert.assertTrue(orginalList.equals(sortedList));
		List<String> price;

		// scan the name coloum with gettext->beans->print the price
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

			price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s))
					.collect(Collectors.toList());

			price.forEach(a -> System.out.println(a));
			if (price.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();

			}
		} while (price.size() < 1);
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
