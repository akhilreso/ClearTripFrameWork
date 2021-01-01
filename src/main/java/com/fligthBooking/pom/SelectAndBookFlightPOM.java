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
public class SelectAndBookFlightPOM {
	
	  WebDriver driver;
	  
	@FindBy(xpath="(//div[@class='ba bc-neutral-100 br-4 px-3 rt-tuple-container tp-box-shadow td-200 hover:elevation-3 c-pointer'])[1]")
	private WebElement firstFlightSelect;
	
	@FindBy(xpath="(//div[@class='col-12']/div[@data-test-attrib='return-view']//div[@class='ba bc-neutral-100 br-4 px-3 rt-tuple-container tp-box-shadow td-200 hover:elevation-3 c-pointer'])[1]")
	private WebElement secondsFlightSelect;
	
	@FindBy(xpath="//button[text()='Book']")
	private WebElement buttonForBook;
	
	
	public  SelectAndBookFlightPOM(WebDriver driver){
		//by this we willl safe from stelElement refreshExeption 
		PageFactory.initElements(driver, this); 
	}
	
	public WebElement gtFirstFlightSelect() {
		
		return firstFlightSelect;
		
	}
	public WebElement getSecondsFlightSelect(){
		
		return secondsFlightSelect;
		
	}
	public WebElement getButtonForBook(){
		
		return buttonForBook;
		
	}
	

}
