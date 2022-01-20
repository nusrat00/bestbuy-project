package com.LocatorPage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Parent_BaseClass;

public class HealthandWellnessPageLocator extends Parent_BaseClass{

	
	public HealthandWellnessPageLocator() {
		
		PageFactory.initElements(driver, this );
		
	}
	
	
	@FindBy(how=How.XPATH,using="//h1[text()='Health & Wellness Solutions']")
	public WebElement verifyinpage;
	
	
}
