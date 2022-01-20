package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_BaseClass{

	public static Properties proper;
	public static WebDriver driver;
	
	public Parent_BaseClass() {
		
		  proper = new Properties();
	
	try {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/com/Config/config.properties");	
	  
		proper.load(file);
	} catch (FileNotFoundException e) {
	 System.out.println("Cofigfile error");
	 	e.printStackTrace();
		
		
	} catch (IOException e) {
		System.out.println("exception error");
		
		e.printStackTrace();
	}

	
	}
	public void browserinitial() {
		 
	String BrowserName = proper.getProperty("Browser1");
	
	if(BrowserName.equalsIgnoreCase("Chrome")) {
		//System.setProperty( "webdriver.chrome.driver", "/Users/Nusratwork/eclipse-workspace/com.inc.dell/Driver/chromedriver");
		
		System.setProperty( "webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(TestData.pageLoadTimeout, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(TestData.implicitlyWait,TimeUnit.SECONDS);
	     
	   	 
	//else if (Browsername.equalsIgnoreCase("FF"));
	
		}	
	}
	
	//launching browser
	public static void launchURL(String URL) {
		
		
		driver.get(proper.getProperty("Url2"));
		//driver.findElement(By.cssSelector("button[class='ooc-choice ooc-dest-country-btn-lbl']")).click();
	     
		
	}
	
	
	}
