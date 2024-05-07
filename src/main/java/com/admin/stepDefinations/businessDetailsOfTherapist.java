package com.admin.stepDefinations;

import org.openqa.selenium.support.ui.Select;

import com.base.Locator;
import com.base.adminLocator;
import com.base.config;
import com.keyword.keyword;

import io.cucumber.java.en.*;

public class businessDetailsOfTherapist  {
	
	keyword key=new keyword();
	@Given("Launch browser successfully")
	public void launch_browser_successfully() {
		key.getWebElement("css", Locator.userName).sendKeys(config.getEmail());
		key.getWebElement("css", Locator.passWord).sendKeys(config.getPassword());
		key.getWebElement("css", Locator.logIn).click();
		key.getWebElement("css", Locator.toaster).click();

	}

	@When("click on edit profile")
	public void click_on_edit_profile() throws InterruptedException {
		Thread.sleep(3000);
		key.clickOn("css", Locator.Profile);
		Thread.sleep(3000);
		key.clickOn("css", Locator.editProfile);
		

	}

	@When("click on business details")
	public void click_on_business_details() throws InterruptedException {
		Thread.sleep(2000);
		key.getWebElement("css",Locator.businessDetails).click();
		

	}

	@Then("edit business details")
	public void edit_business_details() throws InterruptedException {
		
		key.getWebElement("css", Locator.businessName).sendKeys("medical store");;
		key.getWebElement("css", Locator.businessID).sendKeys("875847525");;
		Select reciptNumber=new Select(key.getWebElement("css", Locator.selectReciptNumber));
		reciptNumber.selectByValue("3000");
		key.scrollPage();
		Thread.sleep(2000);
		key.clickOn("css", Locator.updateBusinessdetails);

	}
	
	




}
