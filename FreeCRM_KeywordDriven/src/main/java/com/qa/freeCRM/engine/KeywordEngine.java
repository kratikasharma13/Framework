package com.qa.freeCRM.engine;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class KeywordEngine 
{
	String testDataFilePath = "C://Users//HP//eclipse-workspace//FreeCRM_KeywordDriven//src//main//java//com//qa//freeCRM//testData//FreeCRM_testData.xlsx";
	File file;
	FileInputStream fis;

	// If you are using latest excel sheet having extension .xlsx then you have to use XSSFWorkbook
	XSSFWorkbook xssfworkbook;

// this will read your sheet	
	XSSFSheet sheet;

	int rowCount;
	int columnCount;
	
	String KeywordName;
	String locatorType;
	String locatorValue;
	String testData;
	String executionStatu;
	
	Properties prop;
	WebDriver driver;
	

	
	
		public void startExecution(String sheetName)
		{
		//#1 specify the location of file
			file = new File(testDataFilePath);
			System.out.println("Excel file located Successfully !");
			
			try 
			{
				fis = new FileInputStream(file);
				
				//#2 This is the Class which is coming from ApachePOI & this will load the whole workBook
				// This total workbook will be loaded by this class XSSFWorkbook
				xssfworkbook = new XSSFWorkbook(file);
				System.out.println("Workbook loaded Successfully !");
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			 			
		// here xssfsheet means that particular sheet which you want to get
			sheet =	xssfworkbook.getSheet(sheetName);
			 
			rowCount = sheet.getLastRowNum();
			System.out.println("Row count of sheetname <"+sheetName+"> is "+rowCount);
			
			columnCount = sheet.getRow(2).getLastCellNum(); 
			System.out.println("Column count of sheetname <"+sheetName+"> is "+columnCount);
			
		
			
			
		}
		
		
	
}
