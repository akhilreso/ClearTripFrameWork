/**
 * 
 */
package com.fligthBooking.genrics;

import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

/**
 * @author akhil
 *
 */
public class MyListner implements ITestListener {
	 
	WebDriver driver=null;

	@Override
	public void onFinish(ITestContext arg0) {
		
		Reporter.log("Test end on"+new Date(), true);
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		
		Reporter.log("Test start on "+new Date(), true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		
    
       
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		
		
		
	}

}
