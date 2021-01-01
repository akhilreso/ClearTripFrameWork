/**
 * 
 */
package com.fligthBooking.features;
import java.time.LocalDate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.fligthBooking.genrics.ExcelUtilites;
import com.fligthBooking.pom.SearchFlightsPOM;

/**
 * @author akhil
 *
 */
public class SearchFlightsFeatur {
	
	WebDriver driver;
	SearchFlightsPOM sfpom;
	
	
	public SearchFlightsFeatur(WebDriver driver) {
		this.driver=driver;
		sfpom =new SearchFlightsPOM(driver);
		
	}
	public void searchFlight() {
		
		
	    boolean flag = sfpom.getRoundTripRediobutton().isSelected();
		
	    if(flag==false){
			sfpom.getRoundTripRediobutton().click();
			Reporter.log("Round trip is  Salected", true);
		}
		else {
			Reporter.log("Round Trip is salected", true);
		}
		String path="./excelFile/BookingFlightData.xlsx";
		ExcelUtilites redaData2 = new ExcelUtilites(path);
		String startCity = redaData2.readDataFromExcel("ClearTripSheet1", 1, 0);
		String endCity = redaData2.readDataFromExcel("ClearTripSheet1", 1, 1);
		sfpom.getInputCityNameFrom().sendKeys(startCity);
		sfpom.getInputcityNameTo().sendKeys(endCity);
		
		 
		
		
		//Click and select the date after 5 dayes
		sfpom.getOpenCalendreFirst().click();
		
			
		LocalDate daye = LocalDate.now().plusDays(5);
		String month = (daye.getMonth().name()).toString();
		String monthName = month.substring(0, 1)+month.substring(1,month.length()).toLowerCase();
		int taareekh = daye.getDayOfMonth();
		int yearName = daye.getYear();
		String spath1 = "//span[text()='"+monthName+"']/following-sibling::span[text()='"+yearName+"']/ancestor::div[@class='monthBlock first']//table//tr//a[text()='"+taareekh+"']";
		driver.findElement(By.xpath(spath1)).click();
		
		sfpom.getOpenCalendreScond().click();
		
		LocalDate dateaftera5dayes = LocalDate.now().plusDays(6);
		String montah = (dateaftera5dayes.getMonth().name()).toString();
		String monthaName = montah.substring(0, 1)+montah.substring(1,montah.length()).toLowerCase();
		int taaareekh = dateaftera5dayes.getDayOfMonth();
		int yeaarName = dateaftera5dayes.getYear();
		String spaath1 = "//span[text()='"+monthaName+"']/following-sibling::span[text()='"+yeaarName+"']/ancestor::div[@class='monthBlock first']//table//tr//a[text()='"+taaareekh+"']";

		driver.findElement(By.xpath(spaath1)).click();
//		sfpom.getOpenCalendreScond().click();
		
			
			
			sfpom.getSearchFlightButton().click();
			
		}
		

//      Click and select the date after 1 dayes
//		Actions mouse = new Actions(driver);
//		mouse.sendKeys(sfpom.getOpenCalendreScond(), Keys.ARROW_RIGHT);
//		mouse.sendKeys(sfpom.getOpenCalendreScond(), Keys.ARROW_RIGHT);
	   
	
	  
	}
	
	

