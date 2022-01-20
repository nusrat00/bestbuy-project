package com.ActionPage;

import org.openqa.selenium.JavascriptExecutor;

import com.LocatorPage.LoginPageLocator;
import com.Utility.Parent_BaseClass;

public class LoginPageAction extends Parent_BaseClass {
	
	LoginPageLocator loginPageLocator= new LoginPageLocator();
	
	public void userlogin(String user, String password) {
		
		loginPageLocator.email.sendKeys(user);
		loginPageLocator.password.sendKeys(password);
		
	}
	
	public void enter_user_name_and_password_and_click_login () {

   	    ((JavascriptExecutor)driver).executeScript("scroll (0,400)");
   	 
		loginPageLocator.loginbutton.click();
	}

}

