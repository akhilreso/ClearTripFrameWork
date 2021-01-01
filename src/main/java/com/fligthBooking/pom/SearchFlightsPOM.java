/**
 * 
 */
package com.fligthBooking.pom;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author akhil
 *
 */
public class SearchFlightsPOM {

	WebDriver driver;
	
	@FindBy(xpath="//label[@for='RoundTrip']") 
	private WebElement roundTripRediobutton;
	
	@FindBy(xpath="(//input[@title='Any worldwide city or airport'])[1]")
	private WebElement inputCityNameFrom;
	
	@FindBy(xpath="(//input[@title='Any worldwide city or airport'])[2]")
	private WebElement inputcityNameTo;
	
	
	@FindBy(xpath="//input[@data-next-date-offset='0#ReturnDate']") 
	private WebElement openCalendreFirst;
	
	@FindBy(xpath="//input[@data-warningvalidator='true']")
	private WebElement openCalendreScond;
	
//	@FindBy(xpath="//input[@data-next-date-offset='0#ReturnDate']") 
//	private WebElement selectFirstDate;
	
	@FindBy(xpath="//input[@value='Search flights']")
	private WebElement searchFlightButton;
	
	
	public SearchFlightsPOM(WebDriver drive){
		
		PageFactory.initElements(drive, this);
	}
	
	public WebElement getRoundTripRediobutton(){
		
		return roundTripRediobutton;
	}
	
     public WebElement getInputCityNameFrom() {
		
		return inputCityNameFrom;
	}
     
    public WebElement getInputcityNameTo() {
		
    	return inputcityNameTo;
    	
    }
    
    public WebElement getOpenCalendreFirst(){
		
    	return openCalendreFirst;
    	
    }
    
    public WebElement getOpenCalendreScond(){
		
    	return openCalendreScond;
    	
    }
    
    public WebElement getSearchFlightButton() {
		
    	return searchFlightButton;
    	
    }
    
	public WebElement getSelectdateFromFirstCalendr() {
		
		LocalDate dateafter5dayes = LocalDate.now().plusDays(5);
		String month = (dateafter5dayes.getMonth().name()).toString();
		String monthName = month.substring(0, 1)+month.substring(1,month.length()).toLowerCase();
		int taareekh = dateafter5dayes.getDayOfMonth();
		int yearName = dateafter5dayes.getYear();
		String spath1 = "//span[text()='"+monthName+"']/following-sibling::span[text()='"+yearName+"']/ancestor::div[@class='monthBlock first']//table//tr//a[text()='"+taareekh+"']";
		WebElement fistDate = driver.findElement(By.xpath(spath1));
		
		return fistDate;
		
	}
	
public WebElement getSelectdateFromSecondCalendr() {
		
		LocalDate dateafter5dayes = LocalDate.now().plusDays(6);
		String month = (dateafter5dayes.getMonth().name()).toString();
		String monthName = month.substring(0, 1)+month.substring(1,month.length()).toLowerCase();
		int taareekh = dateafter5dayes.getDayOfMonth();
		int yearName = dateafter5dayes.getYear();
		String spath1 = "//span[text()='"+monthName+"']/following-sibling::span[text()='"+yearName+"']/ancestor::div[@class='monthBlock first']//table//tr//a[text()='"+taareekh+"']";
		WebElement secondDate = driver.findElement(By.xpath(spath1));
		
		return secondDate;
		
	}
	
	
  
}
