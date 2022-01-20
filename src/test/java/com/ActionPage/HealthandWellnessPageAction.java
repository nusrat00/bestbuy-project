package com.ActionPage;


import org.testng.Assert;

import com.LocatorPage.HealthandWellnessPageLocator;
import com.Utility.Parent_BaseClass;
import com.Utility.Utility;



public class HealthandWellnessPageAction extends Parent_BaseClass {

	HealthandWellnessPageLocator healthandWellnessPageLocator =new HealthandWellnessPageLocator();
	
	
	public void verify_Health_Wellness_Soutions_in_Health_Wellness_page_h1() {
	    boolean pagename = healthandWellnessPageLocator.verifyinpage.isDisplayed();
	    Assert.assertTrue(pagename);
	    
	    Utility.takescreenshot(driver, "verify page ");
	}

	
	public void verify_Health_Wellness_Soutions_in_Health_Wellness_page_TITlE()  {
		String title = driver.getTitle();
		Assert.assertEquals( title ,"Health & Wellness Solutions & Technology - Best Buy" );
		Utility.takescreenshot(driver, "verify title");
	}

	
	public void verify_page_link()  {
		String currenturl = driver.getCurrentUrl();
		Assert.assertEquals( currenturl ,"https://www.bestbuy.com/site/health-wellness/health-wellness-solutions/pcmcat1603917798858.c?id=pcmcat1603917798858" );
		Utility.takescreenshot(driver, "verify URl");
	}
}
