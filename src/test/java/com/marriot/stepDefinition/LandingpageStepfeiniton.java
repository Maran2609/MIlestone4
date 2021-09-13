package com.marriot.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import com.marriot.pageobjects.Landingpage;
import com.marriot.pageobjects.Search;
import com.marriot.pageobjects.ThirdTest;
import com.marriot.reusablecomponents.reusabledriver;
import com.marriot.reusablecomponents.reusablemethods;
import com.marriot.uistore.Hotelsearchui;
import com.marriot.uistore.Landingpageui;
import com.marriot.uistore.Thirdtestcaseui;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class LandingpageStepfeiniton extends reusabledriver{
	private org.apache.logging.log4j.Logger log=LogManager.getLogger(LandingpageStepfeiniton.class.getName());

	@Given("^Launch the browser and enter the url$")
	public void launch_the_browser_and_enter_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		reusabledriver.chromedriver();
	    reusablemethods.loadurl(driver);
	    reusablemethods.timelapse(driver);
	}

	@When("^Click on our brands in Homepage$")
	public void click_on_our_brands_in_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Landingpage.mainpage(driver);
	}

	@When("^Verify the logo in list whether it is displayed or not$")
	public void verify_the_logo_in_list_whether_it_is_displayed_or_not() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Landingpage.verifiy(driver);
	}

	@Then("^User navigate to another page$")
	public void user_navigate_to_another_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		driver.findElement(Landingpageui.back).click();
	    System.out.println("Verified");
	}
	@Given("^click on destination$")
	public void click_on_destination() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   Search.Hotelsearch(driver);
	  
	}

	@When("^Enter the \"([^\"]*)\"$")
	public void enter_the(String dest) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Search.destination(dest, driver);
	}
	@When("^click on search$")
	public void click_on_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    Search.button(driver);
	}

	@Then("^User navigate to results$")
	public void user_navigate_to_results() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   if(driver.findElement(Hotelsearchui.test).getText().contains("Bengaluru"))
	   {
		   System.out.println("Correct City");
	   }
	   else
	   {
		   System.out.println(driver.findElement(Hotelsearchui.test).getText());
	   }
	}
	@When("^click on member benefits$")
	public void click_on_member_benefits() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   ThirdTest.member(driver);
	}

	@When("^Verify the text \"([^\"]*)\"$")
	public void verify_the_text(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/section[3]/div/div[3]/div/section/div[2]/div/h3")).getText().contains(arg1))
		{
	   System.out.println("Verified Member");
		}
	}
}
