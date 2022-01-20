package StepDep;



import org.openqa.selenium.WebDriver;

import com.ActionPage.HomePageAction;
import com.ActionPage.LoginPageAction;
import com.ActionPage.ProfilePageAction;
import com.ActionPage.SearchPageAction;
import com.Utility.Parent_BaseClass;

import cucumber.api.java.en.*;

public class Dell_login extends Parent_BaseClass{
	HomePageAction homePageAction = new HomePageAction();
	LoginPageAction loginPageAction = new LoginPageAction ();
	ProfilePageAction profilePageAction =new ProfilePageAction();
	SearchPageAction searchPageAction = new SearchPageAction();
	WebDriver driver;
	
	@Given("^launch dell url \"([^\"]*)\"$")
	public void launch_dell_url(String URL) throws Throwable {
		launchURL(URL);
	}
	
	@Then("^click countryok$")
	public void click_countryok() throws Throwable {
		homePageAction.click_countryok();
	}

	
	@Then("^mouseover Signin$")
	public void mouseover_Signin() throws Throwable {
		homePageAction.mouseover_Signin();
	}

	@Then("^click on signin$")
	public void click_on_signin() throws Throwable {
		homePageAction.click_on_signin();
	}

	@Then("^enter user name and password and click login$")
	public void enter_user_name_and_password_and_click_login() throws Throwable {
		loginPageAction.userlogin(proper.getProperty("UserName"), proper.getProperty("Password"));
		loginPageAction.enter_user_name_and_password_and_click_login();
	}

	@Then("^verify user login in profile$")
	public void verify_user_login_in_profile() throws Throwable {
	   profilePageAction.verify_user_login_in_profile();
	}
	
	@Then("^search xps in search field$")
	public void search_xps_in_search_field() throws Throwable {
	    homePageAction.search_xps_in_search_field();
	}

	@Then("^click search button$")
	public void click_search_button() throws Throwable {
	    homePageAction.click_search_button();
	}

	@Then("^xps page$")
	public void xps_page() throws Throwable {
	    searchPageAction.xps_page();
	}
	@And("^close browser$")
	public void close_browser() {
		Parent_BaseClass.driver.close();
	}
	
}
