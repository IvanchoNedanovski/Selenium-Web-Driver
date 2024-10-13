package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before execute any methods in the class");
	}
	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebLoginCarLoan(String urlname, int key)
	{
		//selenium
		System.out.println("WebLoginCar");
		System.out.println(urlname);
		System.out.println(key);
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("After execute all methods in the class");
	}
	
	@Test(groups={"Smoke"})
	public void MobileLoginCarLoan()
	{
		//Appium
		System.out.println("MobileLoginCar");

	}
	@BeforeMethod
	public void BeforeEvery()
	{
		System.out.println("i will execute before every test method in day 3 class");
	}
	@AfterMethod
	public void AFterEvery()
	{
		System.out.println("i will execute after every test method in day 3 class");
	}
	@BeforeSuite
	public void BfSuite()
	{
		System.out.println("I am no 1");
	}
	
	@Test(enabled = false)
	public void MobileSignInCarLoan()
	{
		//Appium
		System.out.println("Mobile Sign in");

	}
	@Test(dataProvider ="GetData")
	public void MobileSignOutCarLoan(String username,String password)
	{
		//Appium
		System.out.println("Mobile Sign Out");
        System.out.println(username);
        System.out.println(password);
	}
	
	@Test(dependsOnMethods = {"MobileLoginCarLoan","MobileSignOutCarLoan"})
	public void APICarLoan()
	{
		//REst api automation
		System.out.println("ApiLoginCar");

	}
	@DataProvider
	public Object[][] GetData()
	{
		//1st combination-username paswoord-good credti history
		//2nd-username password-no credti history
		//3rd-fraudent credit historu
		Object[][] data=new Object[3][2];
		data[0][0]="FirstSetUsername";
		data[0][1]="FirtsPassword";
		//coloums in the row are nothing but values for that particular combination(row)
		
		
		//2nd set
		
		data[1][0]="SecondSetUsername";
		data[1][1]="SecondPassword";
		
		
		//3rd se
		
		data[2][0]="ThirdSetUsername";
		data[2][1]="ThirdSPassword";
		
		return data;

	}
	

}
