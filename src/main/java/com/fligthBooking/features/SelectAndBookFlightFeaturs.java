/**
 * 
 */
package com.fligthBooking.features;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.fligthBooking.pom.SelectAndBookFlightPOM;

/**
 * @author akhil
 *
 */
public class SelectAndBookFlightFeaturs {
	
	WebDriver driver;
	SelectAndBookFlightPOM sabFlight;
    
	
	public SelectAndBookFlightFeaturs(WebDriver driver){
		this.driver=driver;
		sabFlight=new SelectAndBookFlightPOM(driver);
	}
	
	public void selectAndBookFlight() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//ElementClicInterseptedExeption solve by csroll
//		js.executeScript("arguments[0].scrollIntoView(true)",sabFlight.gtFirstFlightSelect());
		sabFlight.gtFirstFlightSelect().click();
		
		//ElementClicInterseptedExeption solve by csroll
		//JavascriptExecutor jk = (JavascriptExecutor)driver;
		
		
//		jk.executeScript("arguments[0].scrollIntoView(true)",sabFlight.getSecondsFlightSelect());
		sabFlight.getSecondsFlightSelect().click();
		
		sabFlight.getButtonForBook().click();
		
	}
}
