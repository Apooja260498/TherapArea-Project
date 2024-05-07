package com.admin.stepDefinations;

import com.base.Locator;
import com.base.adminLocator;
import com.base.config;
import com.keyword.keyword;

import io.cucumber.java.en.*;

public class adminPanel {
	keyword key=new keyword();
	
	@Given("Browser launch successfully and open Url")
	public void browser_launch_successfully_and_open_url() {
	    
	}

	@When("enter valid username and password")
	public void enter_valid_username_and_password() {
	  key.getWebElement("css",Locator.userName).sendKeys(config.getAdminEmail());
	  key.getWebElement("css", Locator.passWord).sendKeys(config.getAdminPassword());
	}

	@Then("click on Login button")
	public void click_on_login_button() throws InterruptedException {
		Thread.sleep(2000);
	  key.clickOn("css", Locator.logIn);
	  
	}

	@Then("check login successfully messasge")
	public void check_login_successfully_messasge() {
		  key.getWebElement("css", Locator.toaster).isDisplayed();
		  System.out.println(key.getWebElement("css", Locator.toaster));
		  
	}

	@When("enter Invalid username and password")
	public void enter_invalid_username_and_password() {
	    key.getWebElement("css", Locator.userName).sendKeys(config.getPatientInvalidEmail());
	    key.getWebElement("css", Locator.passWord).sendKeys(config.getAdminPassword());
	    key.clickOn("css", Locator.logIn);
	}

	@Then("check error  messasge  visible")
	public void check_error_messasge_visible() {
	    System.err.print(key.getWebElement("css", Locator.toaster));
	}




}
