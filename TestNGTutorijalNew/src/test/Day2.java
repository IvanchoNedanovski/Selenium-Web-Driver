package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups={"Smoke"})
	public void Ploan()
	{
		System.out.println("good");
	}
	
	@BeforeTest
	public void Prerequeste()
	{
		System.out.println("i will excute first");
	}

}
