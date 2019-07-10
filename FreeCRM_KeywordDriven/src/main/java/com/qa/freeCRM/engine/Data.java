package com.qa.freeCRM.engine;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {
	
	static String testDataFilePath = "C:\\Users\\HP\\eclipse-workspace\\FreeCRM_KeywordDriven\\src\\main\\java\\com\\qa\\freeCRM\\testData\\Dat_driven.xlsx";
//	String projectFilePath = "";

	public static void main(String[] args) throws Exception  {
	System.out.println("i");
	File src=new File(testDataFilePath);
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh= wb.getSheet("Demosheet");
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());

	}

}
