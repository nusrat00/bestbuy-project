package com.ActionPage;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.LocatorPage.ProfilePageLocator;
import com.Utility.Parent_BaseClass;
import com.Utility.Utility;



public class ProfilePageAction extends Parent_BaseClass{
	
	ProfilePageLocator profilePageLocator = new ProfilePageLocator();
	 public void verify_user_login_in_profile () {
		 Actions ac =  new Actions(driver);
		ac.moveToElement(profilePageLocator.verify).build().perform();;
		//profilePageLocator.verify.click();
		boolean profile = profilePageLocator.ProfilePage.isDisplayed();
		Assert.assertTrue(profile);
		Utility.takescreenshot(driver, "profile page");
		
	 }
}

