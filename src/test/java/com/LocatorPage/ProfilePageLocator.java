package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Parent_BaseClass;

public class ProfilePageLocator  extends Parent_BaseClass{
public ProfilePageLocator() {
		
		PageFactory.initElements(driver, this );
		
	}

 @FindBy(how=How.XPATH,using="//a[@class='mh-myaccount-btn mh-flyout-link']")
 public WebElement verify;
@FindBy(how=How.XPATH,using="//div[text()='Welcome, nusrat jahan']")
public WebElement ProfilePage;

}
