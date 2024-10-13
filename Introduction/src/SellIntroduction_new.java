import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SellIntroduction_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoking browser
		//chroome-chroomedriver-methods close
		//firefox -firefoxdriver-methots
	//	System.getProperty("webdriver.chrome.driver", "C:\\Users\\ivanc\\Downloads\\chromedriver_win32.exe");
	//	WebDriver driver = new ChromeDriver();
		
		
		System.getProperty("webdriver.edge.driver", "C:\\Users\\ivanc\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
	    driver.get("https://rahulshettyacademy.com/");
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.close();
		

	}

}
