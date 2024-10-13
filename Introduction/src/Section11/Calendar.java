package Section11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\ivanc\\Downloads\\chromedriver_win32.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.path2usa.com/travel-companion/");
		//april 14
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		
		List<WebElement> dates = driver.findElements(By.className(".flatpickr-day"));
		int count= driver.findElements(By.className("flatpickr-day")).size();
		
		for(int i =0;i<count;i++) {
			String text=driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if(text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
			
		}
		
		

	}

}
