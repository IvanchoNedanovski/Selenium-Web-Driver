import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example {

	public static void main(String[] args) throws SQLException {
		String host = "localhost";
		String port = "3306";

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nedanovski", "root", "selenium");

		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from brajka where id ='1'");
		while(rs.next())
		{
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ivanc\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(option);

			driver.get("https://login.salesforce.com/");
			driver.findElement(By.id("username")).sendKeys(rs.getString("ime"));
			driver.findElement(By.id("password")).sendKeys(rs.getString("prezime"));

	}

}}
