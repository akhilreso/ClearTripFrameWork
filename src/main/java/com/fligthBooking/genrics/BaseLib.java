/**
 * 
 */
package com.fligthBooking.genrics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
/**
 * @author akhil
 *
 */
public class BaseLib{
	
	public static WebDriver driver;
	 
	/*
	 * Here we write the pre condastions like lauch the browser and 
	 * and apply implicitlywait() for 10 second;
	 * */
	@BeforeTest
	@Parameters({"browser" , "bseURL"})
	public void preCondations(String browser , String bseURL){
		
		driver=BrowserFactory.launchBrowser(browser);
		driver.manage().window().maximize();
		driver.get(bseURL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	 
	
	@AfterTest
	public void postConations(){
		
		
		Reporter.log("Executed ", true);
		
		
	}

}
