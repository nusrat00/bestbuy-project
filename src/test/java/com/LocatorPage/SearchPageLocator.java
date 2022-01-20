package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Parent_BaseClass;

public class SearchPageLocator extends Parent_BaseClass {
	
public SearchPageLocator () {
		
		PageFactory.initElements(driver, this );
		
	}
@FindBy(how=How.XPATH,using="//span[@data-masked=\"xps\"]")
public WebElement XPSverify;


}
