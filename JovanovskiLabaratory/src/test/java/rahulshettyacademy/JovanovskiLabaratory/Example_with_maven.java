package rahulshettyacademy.JovanovskiLabaratory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Example_with_maven {
	
	@Test
	public  void Example_with_maven() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ivanc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jovanovskilaboratory.com/");
		
		driver.findElement(By.linkText("Products")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300);");
		

}
}