package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Parameters({"URL"})
	@Test
	public void WebLoginHomeLoan(String uname)
	{
		//selenium
		System.out.println("WebLoginHomePersonalLona");
	    System.out.println(uname);
	}
	
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileLoginHomeCar");

	}
	
	@Test
	public void LoginApiHomeLoan()
	{
		//REst api automation
		System.out.println("ApiLoginHome");

	}
	

}
