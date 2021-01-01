/**
 * 
 */
package com.fligthBooking.genrics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

/**
 * @author akhil
 *
 */
public class BrowserFactory{
	
	WebDriver driver;
	
	public static WebDriver launchBrowser(String browserName) {
		
		
		WebDriver driver = null;
		
		if(browserName.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		    driver=new ChromeDriver();
			Reporter.log("Chrome browser launched", true);

		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
			driver=new FirefoxDriver();
			Reporter.log("FireFox browser launched", true);
		}
		else {
			System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		    driver=new ChromeDriver();
			Reporter.log("Chrome browser launched", true);

		}
		
		return driver;
		
		
	}

}
