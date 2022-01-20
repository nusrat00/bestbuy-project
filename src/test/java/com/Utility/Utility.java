package com.Utility;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Utility extends Parent_BaseClass{
	
/*public static void takescreenshot(WebDriver driver, String screenshot) {
		
		File Screenshotfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String currentdir = System.getProperty("user.dir");
		
		try {
			FileUtils.copyFile(Screenshotfile, new File(currentdir+"/Screenshots/"+screenshot+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}*/

public static void takescreenshot(WebDriver driver, String screenshot) {
	
	File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	String correntdir = System.getProperty("user.dir");
	
	try {
		FileUtils.copyFile(srcfile, new File(correntdir+"/Screenshots"+screenshot+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

}
