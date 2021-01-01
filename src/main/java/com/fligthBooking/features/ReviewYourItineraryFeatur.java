/**
 * 
 */
package com.fligthBooking.features;

import org.openqa.selenium.WebDriver;

import com.fligthBooking.pom.ReviewYourItineraryPOM;

/**
 * @author akhil
 *
 */
public class ReviewYourItineraryFeatur {
	
	WebDriver driver;
	ReviewYourItineraryPOM review;
	
	public ReviewYourItineraryFeatur(WebDriver driver){
		this.driver=driver;
		review=new ReviewYourItineraryPOM(driver);
		
	}
	
	public boolean ticketVarification() {
		boolean vvalue = review.getReviewYourItinerary().isDisplayed();
		
		
		
		return vvalue;
		
	}
	public String ticketVarification2() {
		
		String title = review.getReviewYourItinerary().getText();
		
		return title;
		
	}
	

}
