package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Parent_BaseClass;

public class BestBuyhomeLocator extends Parent_BaseClass {

public BestBuyhomeLocator() {
		
		PageFactory.initElements(driver, this );
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[2]/div[5]/div/div/div[1]/div/div/div/div/button")
	public WebElement popup;
	
	@FindBy(how=How.XPATH,using="//a[@href=\"/site/health-fitness-sports/health-wellness/pcmcat1603917798858.c?id=pcmcat1603917798858\"]")
	public WebElement healthandwellness;
	
}