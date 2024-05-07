package com.admin.stepDefinations;

import com.base.patientPanelLocator;
import com.keyword.keyword;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPatientPanel {
	
	keyword key=new keyword();
	
	@Given("browser launch successfully")
	public void browser_launch_successfully() {
	   
	}

	@When("user enter valid email addess")
	public void user_enter_valid_email_addess() {
	    
	}

	@When("valid password")
	public void valid_password() {
	    
	}

	@When("click on login button")
	public void click_on_login_button() {
	   
	}

	@Then("dashboard page should be open")
	public void dashboard_page_should_be_open() throws InterruptedException {
	   Thread.sleep(2000);
	}

	@Then("patient should be able to scedule appointment")
	public void patient_should_be_able_to_scedule_appointment_s() throws InterruptedException {
	   key.getWebElement("css",patientPanelLocator.appointment).click();
	   key.getWebElement("css", patientPanelLocator.appointmentDate).click();
	   key.getWebElement("css", "body > theraparea-client-root:nth-child(1) > section:nth-child(2) > theraparea-client-header-sidebar:nth-child(2) > theraparea-client-dashboard:nth-child(4) > theraparea-client-common-modal-patient:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > p-calendar:nth-child(1) > span:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(4)").click();
	   Thread.sleep(2000);
	   
	   key.getWebElement("css", patientPanelLocator.appointmentTime).click();
	   key.getWebElement("css",patientPanelLocator.appointmentTime).sendKeys("01:40 PM");
	   
	   key.clickOn("css", patientPanelLocator.requestAppointment);
	}
	

}
