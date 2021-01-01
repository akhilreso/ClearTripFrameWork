/**
 * 
 */
package com.fligthBooking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author akhil
 *
 */
public class ReviewYourItineraryPOM {
	
	WebDriver driver;
	
	@FindBy(xpath="//h2[text()='Review your itinerary']")
	private WebElement reviewYourItinerary;
	
	
	public ReviewYourItineraryPOM(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getReviewYourItinerary() {
		
		return reviewYourItinerary;
		
	}
	
	

}
