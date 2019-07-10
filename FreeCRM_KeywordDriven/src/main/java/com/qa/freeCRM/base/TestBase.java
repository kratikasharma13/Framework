package com.qa.freeCRM.base;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{
	//shortcut  key Importing  -> crtl+shiift+o
	Properties prop;
	WebDriver driver;
	String projectFilePath = "\\src\\main\\java\\com\\qa\\freeCRM\\config\\config.properties";
	FileInputStream fis;
	File file;
	String  fullfilePath;
	String currentRootDirectory;

	
	public WebDriver init_driver(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", projectFilePath+"\\driver\\chromedriver.exe");
			
	//		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Kratika\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		 
		return driver;
		
	}
	
	
	
	public Properties readProperty()
	{
		
		
		currentRootDirectory = System.getProperty("user.dir");
		System.out.println("#Current User Root Directory Path =>"+currentRootDirectory);
		fullfilePath = currentRootDirectory+projectFilePath;
		
		file = new File(fullfilePath);
		
		prop = new Properties();
		try {
			fis = new FileInputStream(file); // convert file to bytstream
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("#Actual File Path ---> "+fullfilePath);
		//prop.getProperty(key)
		
		return prop;
		
		
	}
	
	
}
