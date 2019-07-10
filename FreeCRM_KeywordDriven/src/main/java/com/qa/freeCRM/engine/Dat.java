package com.qa.freeCRM.engine;


	import java.io.File;
import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	
	public class Dat {
		static String testDataFilePath = "C://Users//HP//eclipse-workspace//FreeCRM_KeywordDriven//src//main//java//com//qa//freeCRM//testData//FreeCRM_testData.xlsx";
		//String projectFilePath = "C:\\Users\\HP\\Final_workspace\\tesNG practise\\Excel\\Dat_driven.xlsx";

		public static void main(String[] args) throws Exception  {
		System.out.println("i");
		File src=new File(testDataFilePath);
			FileInputStream fis = new FileInputStream(src);
			
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet sh= wb.getSheet("FreeCRM_AddContact");
			System.out.println(sh.getRow(0).getCell(0).getStringCellValue());

		}	
}
