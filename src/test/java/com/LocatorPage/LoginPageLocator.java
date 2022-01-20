package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Parent_BaseClass;

public class LoginPageLocator extends Parent_BaseClass{
public LoginPageLocator() {
		
		PageFactory.initElements(driver, this );
		
	}

@FindBy(how=How.XPATH,using="//input[@id='EmailAddress']")
public WebElement email;

@FindBy(how=How.XPATH,using="//input[@id='Password']")
public WebElement password;

@FindBy(how=How.XPATH,using="//button[@id='sign-in-button']")
public WebElement loginbutton;

}
