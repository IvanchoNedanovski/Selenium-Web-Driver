package Section8_9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.getProperty("webdriver.chrome.driver", "C:\\Users\\ivanc\\Downloads\\chromedriver_win32.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);

		int j = 0;
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot","Carrot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// formta it to get actual vegetable name
			// convert array into array list gor eeasy search
			// check wheter name you extracted is present in arrat or not

			List itemsNeddedList = Arrays.asList(itemsNeeded); // ja convertira list vo arralist

			if (itemsNeddedList.contains(formattedName)) {
				// click to add cart

				j++;

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length) {
					break;
				}

			}

		}

//	for (int i = 0; i < products.size(); i++) {
//			String name = products.get(i).getText();
//
//			if (name.contains("Brocoli")) {
//				// click to add cart
//
//				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//				break;
//
//			}
//
//	}

	}

}
