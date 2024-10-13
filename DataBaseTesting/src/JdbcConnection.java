import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JdbcConnection {

	public static void main(String[] args) throws SQLException {
		String host = "localhost";
		String port = "3306";

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "selenium");

		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from credentials where scenario ='rewardscard'");
		while(rs.next())
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ivanc\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(option);
			driver.get("https://login.salesforce.com/");
			driver.findElement(By.id("username")).sendKeys(rs.getString("username"));
			driver.findElement(By.id("password")).sendKeys(rs.getString("password"));
		
	}
	}
	}


