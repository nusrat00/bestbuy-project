package com.ActionPage;

import org.testng.Assert;

import com.LocatorPage.BestBuyhomeLocator;
import com.Utility.Parent_BaseClass;
import com.Utility.Utility;



public class BestBuyhomeAction extends Parent_BaseClass {
	
	BestBuyhomeLocator bestBuyhomeLocator  = new BestBuyhomeLocator ();
	


	
	public void close_pop_up()  {
		bestBuyhomeLocator.popup.click();
	   
	}


	public void verify_Health_Wellness_link_available_in_the_home_page()  {
	
		boolean verifyhealthandwellness = bestBuyhomeLocator.healthandwellness.isDisplayed();
		Assert.assertTrue(verifyhealthandwellness);
		Utility.takescreenshot(driver, "health and wellness in home page");
	}

	
	public void click_on_Health_Wellness() {
		
	   bestBuyhomeLocator.healthandwellness.click();
	}

	


		
	
}
