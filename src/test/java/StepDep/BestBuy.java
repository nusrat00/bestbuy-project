package StepDep;

import com.ActionPage.BestBuyhomeAction;
import com.ActionPage.HealthandWellnessPageAction;

import com.Utility.Parent_BaseClass;

import cucumber.api.java.en.*;

public class BestBuy extends Parent_BaseClass {
	BestBuyhomeAction bestbuyhomeAction = new BestBuyhomeAction();
	HealthandWellnessPageAction healthandWellnessPageAction = new HealthandWellnessPageAction();
	
	
	@Given("^Open Application \"([^\"]*)\"$")
	public void open_Application(String URL) throws Throwable {
	    launchURL(URL);
	}

	@Then("^close pop up$")
	public void close_pop_up() throws Throwable {
	   bestbuyhomeAction.close_pop_up();
	}

	@Then("^Verify Health & Wellness link available in the home page$")
	public void verify_Health_Wellness_link_available_in_the_home_page() throws Throwable {
	    bestbuyhomeAction.verify_Health_Wellness_link_available_in_the_home_page();
	}

	@Then("^Click  on  Health & Wellness$")
	public void click_on_Health_Wellness() throws Throwable {
	   bestbuyhomeAction.click_on_Health_Wellness();
	}

	@Then("^Verify  Health & Wellness Soutions in  Health & Wellness page h1$")
	public void verify_Health_Wellness_Soutions_in_Health_Wellness_page_h1() throws Throwable {
	   healthandWellnessPageAction.verify_Health_Wellness_Soutions_in_Health_Wellness_page_h1();
	}

	@Then("^Verify  Health & Wellness Soutions in  Health & Wellness page TITlE$")
	public void verify_Health_Wellness_Soutions_in_Health_Wellness_page_TITlE() throws Throwable {
	   healthandWellnessPageAction.verify_Health_Wellness_Soutions_in_Health_Wellness_page_TITlE();
	}

	@Then("^verify page link$")
	public void verify_page_link() throws Throwable {
	    healthandWellnessPageAction.verify_page_link();
	}
}
