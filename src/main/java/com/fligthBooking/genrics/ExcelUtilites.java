/**
 * 
 */
package com.fligthBooking.genrics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

/**
 * @author akhil
 *
 */
public class ExcelUtilites {
	
	String excelFilePath;
	
	public ExcelUtilites(String excelFilePath) {
		
		this.excelFilePath=excelFilePath;
	}
	
	public  String readDataFromExcel(String sheetName ,int rownum ,int cellnum ){
		
		String value=null;
		try {
		FileInputStream fis = new FileInputStream(new File(excelFilePath));
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
	    CellType cellType = cell.getCellType();
	    switch (cellType) {
		case STRING:
		 
			value=cell.getStringCellValue();
			break;
			
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cell)) {
				SimpleDateFormat sp = new SimpleDateFormat("EEE, d MMM,' 'yyyy");
				value=sp.format(cell.getDateCellValue());
				Reporter.log("Date salected from excel file", true);
			}
			else {
				System.out.println("Spesific date not found");
				
			}

		default:
			break;
		}
		}
		catch(EncryptedDocumentException e) {
			e.printStackTrace();
		}
       catch(IOException io) {
			io.printStackTrace();
		}
		
		return value;
		
		
	}

}
