package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestLineters interface which implements TestNG lineters
public class Listeners implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I succesfully executed Listeners pass code ");

	}

	@Override
	public void onTestFailure(ITestResult result) {

		// scresshot code

		// response if api id failed
		
		System.out.println("I failed executed Listeners pass code " +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext content) {

	}

	@Override
	public void onFinish(ITestContext content) {

	}

	
  
	
}
