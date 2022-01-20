package com.ActionPage;


import org.testng.Assert;

import com.LocatorPage.SearchPageLocator;
import com.Utility.Parent_BaseClass;
import com.Utility.Utility;

public class SearchPageAction extends Parent_BaseClass{
	
	SearchPageLocator searchPageLocator =new SearchPageLocator();
	
	public void xps_page () {
		
		boolean Xps = searchPageLocator.XPSverify.isDisplayed();
		Assert.assertTrue(Xps);
		Utility.takescreenshot(driver, "xps search");
	}

}
