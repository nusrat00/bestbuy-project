package com.ActionPage;

import com.Utility.Parent_BaseClass;
import com.Utility.TestData;
import com.LocatorPage.*;
public class HomePageAction extends Parent_BaseClass {
 
	HomePageLocator homePageLocator = new HomePageLocator();
	
	 public void click_countryok () {
		 homePageLocator.countryok.click();
		 
	 }
	public void mouseover_Signin () {
		//Actions ac = new Action (driver);
	
		homePageLocator.signinbutton.click();
		
	}
	 public void click_on_signin () {
		 
		 homePageLocator.signinlink.click();
	 }
	
	 public void search_xps_in_search_field () {
		 
		 homePageLocator.searchField.sendKeys(TestData.searchdata1);
		 
	 }
	 
	 public void click_search_button () {
		 
		 homePageLocator.searchButton.click();
	 }
	
}
