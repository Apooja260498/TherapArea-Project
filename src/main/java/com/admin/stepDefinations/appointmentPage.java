package com.admin.stepDefinations;

import java.util.logging.LogManager;

import com.base.patientPanelLocator;
import com.keyword.keyword;

import io.cucumber.core.logging.Logger;
import io.cucumber.java.en.*;

public class appointmentPage {
	
	keyword key = new keyword();

	@When("patient click on appointment")
	public void patient_click_on_appointment() throws InterruptedException {
		Thread.sleep(2000);
		key.getWebElement("css", patientPanelLocator.appointmentPage).click();
	

	}

	@Then("patient able to see appoinment")
	public void patient_able_to_see_appoinment() {
		key.getWebElement("css", patientPanelLocator.tableData).isDisplayed();
	}

	@When("click on payment")
	public void click_on_payment() {
		key.getWebElement("css", patientPanelLocator.Payment).click();
	}

	@Then("check payment should be visible")
	public void check_payment_should_be_visible() {
		key.getWebElement("css", patientPanelLocator.paymentTable).isDisplayed();
	}

	@When("click on meditation")
	public void click_on_meditation() {
		key.getWebElement("css", patientPanelLocator.meditation).click();

	}

	

}
