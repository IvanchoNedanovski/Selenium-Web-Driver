package rahulshettyacademy.JovanovskiLabaratory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Example_Basic_code {
@Test
	public  void Example() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ivanc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jovanovskilaboratory.com/");
		
		
		WebElement navbardriver = driver.findElement(By.xpath("//nav/ul"));
		System.out.println(navbardriver.findElements(By.tagName("a")).size()); // ke ispecati kolku linkoj ima vo taja
																				// kolona

		
		for(int i=1;i<navbardriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER); // se kreira string metod i ovaj cekor e za otvoranje na linkoj vo novi taboj
			navbardriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(2000L);
			
		}
		Actions a = new Actions(driver);

		WebElement move = driver.findElement(By.xpath("//nav/ul/li"));

		a.moveToElement(driver.findElement(By.xpath("//nav/ul/li[7]"))).click().build().perform();
		driver.findElement(By.className("form-control")).sendKeys("ivancho");
		driver.findElement(By.id("email")).sendKeys("ivanconedanovski@gmail.com");
		driver.findElement(By.id("subject")).sendKeys(" 3d printer");
		driver.findElement(By.id("message")).sendKeys(" hello i want to buy 3d printer but i cant find esay way to buy .told me some friends the your best to find i and buy and send to me");
	}

}
