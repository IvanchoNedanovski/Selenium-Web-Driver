package Section11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\ivanc\\Downloads\\chromedriver_win32.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		

		WebElement coloumdriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		System.out.println(coloumdriver.findElements(By.tagName("a")).size());


		for(int i=1;i<coloumdriver.findElements(By.tagName("a")).size();i++) {
			
		String clickonlinkTab =	Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000);
		}//opens all tabs
			Set<String> abc=driver.getWindowHandles();
		Iterator<String>it=abc.iterator();
		
		while(it.hasNext()) {
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
		}
			
			
		}
	}


