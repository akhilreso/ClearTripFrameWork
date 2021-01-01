/**
 * 
 */
package com.flightBooking.scripts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fligthBooking.features.ReviewYourItineraryFeatur;
import com.fligthBooking.features.SearchFlightsFeatur;
import com.fligthBooking.features.SelectAndBookFlightFeaturs;
import com.fligthBooking.genrics.BaseLib;

/**
 * @author akhil
 *I done cross browser testing plsese tell me how parlell testing could be done ;
 */
public class TicketBookingTest extends BaseLib {
	
	@Test 
	public void roundTripTicketTest() {
		
		SearchFlightsFeatur sfTest = new SearchFlightsFeatur(driver);
		sfTest.searchFlight();
		
	}
	
	@Test(dependsOnMethods={"roundTripTicketTest"})
	public void selectAndBookFlight() {
		SelectAndBookFlightFeaturs select = new SelectAndBookFlightFeaturs(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		select.selectAndBookFlight();
	}
	@Test(dependsOnMethods={"selectAndBookFlight"})
	public void ticketBookingVairification() {
		Set<String> sessionId = driver.getWindowHandles();
		Iterator<String> itr = sessionId.iterator();
		String firstPage = itr.next();
		String secondPage = itr.next();
		driver.switchTo().window(secondPage);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ReviewYourItineraryFeatur ryItenit = new ReviewYourItineraryFeatur(driver);
	    boolean varification = ryItenit.ticketVarification();
	    Assert.assertEquals(varification, true);
	    
	    Assert.assertEquals(ryItenit.ticketVarification2(), "Review your itinerary");
	    Reporter.log( ryItenit.ticketVarification2() +"....is varified", true);
	    
	    
	   
	}

}
