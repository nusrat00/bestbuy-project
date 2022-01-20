package com.LocatorPage;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import com.Utility.Parent_BaseClass;

public class HomePageLocator extends Parent_BaseClass {
	
	public HomePageLocator() {
		
		PageFactory.initElements(driver, this );
		
	}
	
	@FindBy(how=How.CSS,using="button[class='ooc-choice ooc-dest-country-btn-lbl']")
	public WebElement countryok;
	
	@FindBy(how=How.XPATH,using="//span[text()='Sign In']")
	public WebElement signinbutton;
	
	@FindBy(how=How.XPATH,using="//a[@href='//www.dell.com/Identity/global/LoginOrRegister/98254675-AC6F-47D9-A7E4-4537724F135D?c=us&l=en&r=us&s=corp&redirectUrl=']")
	public WebElement signinlink;
	
	@FindBy(how=How.ID,using="mh-search-input")
	public WebElement searchField;
	
	@FindBy(how=How.XPATH,using="//button[@class='mh-search-btn mh-search-submit']")
	public WebElement searchButton;

}
