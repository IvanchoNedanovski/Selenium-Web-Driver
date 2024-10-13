import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Jovanovski_ConectBase {

	public static void main(String[] args) throws InterruptedException, SQLException {
		String host = "localhost";
		String port = "3306";

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jovanovski", "root", "selenium");

		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from podatoci where name ='ivancho'");
		while(rs.next())
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ivanc\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(option);
			driver.get("http://jovanovskilaboratory.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Contact")).click();
			driver.findElement(By.id("name")).sendKeys(rs.getString("name"));
			driver.findElement(By.id("email")).sendKeys(rs.getString("email"));
			driver.findElement(By.id("subject")).sendKeys(rs.getString("subject"));
			driver.findElement(By.id("message")).sendKeys(rs.getString("message"));
			Thread.sleep(3000);
			driver.findElement(By.linkText("Home")).click();
			
			

	}
	

	}

}
