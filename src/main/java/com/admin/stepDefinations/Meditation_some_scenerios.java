package com.admin.stepDefinations;

import java.awt.event.KeyEvent;

import org.openqa.selenium.support.ui.Select;

import com.base.Locator;
import com.base.config;
import com.base.patientPanelLocator;
import com.keyword.keyword;
import com.wait.waitFor;

import io.cucumber.java.en.*;

public class Meditation_some_scenerios {
	keyword key=new keyword();
	
	
	@Given("launch browser and open URL successfully")
	public void launch_browser_and_open_url_successfully() {
		key.enterText("css", patientPanelLocator.patientEmail, config.getEmail());
		key.enterText("css", patientPanelLocator.patientPassword, config.getPassword());
		key.clickOn("css", patientPanelLocator.loginPatient );
		System.out.println(key.getWebElement("css", Locator.toaster).getText());
	}

	@When("click on meditation in therapist panel")
	public void click_on_meditation_in_therapist_panel() throws InterruptedException {
	   Thread.sleep(2000);
	   key.clickOn("css", Locator.Meditation);
	   }

	@When("create new program")
	public void create_new_program() throws InterruptedException {
		Thread.sleep(2000);
		key.getWebElement("css", Locator.crprogramNameeateNewProgram).click();
		Thread.sleep(1000);

		key.getWebElement("css", Locator.catagoryforProgram).click();

		key.hitKey(KeyEvent.VK_ENTER);
		key.getWebElement("css", Locator.programName).sendKeys("new program 6 auto");
		key.getWebElement("css", Locator.programDescription).sendKeys("this is my new program for automation");
		key.getWebElement("css", Locator.programFees).sendKeys("10");

		key.scrollPage();
		key.getWebElement("css", Locator.audio).click();

		Select iteration = new Select(key.getWebElement("css", Locator.selectIteration));
		iteration.selectByValue("2");
		Select frequence = new Select(key.getWebElement("css", Locator.selectFrequency));
		frequence.selectByValue("6");
		Thread.sleep(2000);
		key.getWebElement("css", Locator.saveProgram).click();
		key.getWebElement("css", Locator.addProgram).click();
		key.getWebElement("css", Locator.assignProgram).click();

	}
	
	
	@When("assign it to patient")
	public void assign_it_to_patient() throws InterruptedException {
			Thread.sleep(2000);
			key.getWebElement("xpath", Locator.selectDate).sendKeys("05/02/2024");
			key.hitKey(KeyEvent.VK_ENTER);
			Select patient=new Select(key.getWebElement("css", Locator.PatientName));
			patient.selectByValue("3a1244b5-d54e-f7d9-d639-a8e17f727bb8");
			Select Payment=new Select(key.getWebElement("css", Locator.PaymentMode));
			Payment.selectByValue("1");
			Select paymentMode=new Select(key.getWebElement("css", Locator.offlinePaymentMode));
			paymentMode.selectByValue("0");
			key.clickOn("css", Locator.sceduleProgram);
	}
	@Given("Launch Browser and open url successfully")
	public void launch_browser_for_patientPanel_and_open_url_successfully() throws InterruptedException {
		Thread.sleep(2000);
		key.enterText("css", patientPanelLocator.patientEmail, config.getPatientEmail());
		key.enterText("css", patientPanelLocator.patientPassword, config.getPassword());
		key.clickOn("css", patientPanelLocator.loginPatient );
		System.out.println(key.getWebElement("css", Locator.toaster).getText());
	}

	@When("click on meditation in patient panel")
	public void click_on_meditation_in_patient_panel() throws InterruptedException {
		Thread.sleep(2000);
		 key.getWebElement("css",patientPanelLocator.meditation).click();
	}

	@Then("check assign program visible or not")
	public void check_assign_program_visible_or_not() {
		String label=key.getWebElement("css", patientPanelLocator.therapistProgram).getText();
		System.out.println(label);
		
		
	}



	
	
	
	
	
	

	/*
	 * @Then("login patient panel") public void login_patient_panel() {
	 * 
	 * }
	 * 
	 * @Then("Go to meditation") public void go_to_meditation() { // Write code here
	 * that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Then("check assign program visible or not.") public void
	 * check_assign_program_visible_or_not() { // Write code here that turns the
	 * phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Given("Launch Browser and open url successfully") public void
	 * launch_browser_for_patient_Panel_and_open_url_successfully() {
	 * key.enterText("css", patientPanelLocator.patientEmail,
	 * config.getPatientEmail()); key.enterText("css",
	 * patientPanelLocator.patientPassword, config.getPassword());
	 * key.clickOn("css", patientPanelLocator.loginPatient );
	 * System.out.println(key.getWebElement("css", Locator.toaster).getText()); }
	 * 
	 * @When("click on meditation in patient panel") public void
	 * click_on_meditation_in_patient_panel() throws InterruptedException {
	 * Thread.sleep(2000); key.getWebElement("css",
	 * patientPanelLocator.meditation).click(); key.getWebElement("css",
	 * patientPanelLocator.purchase).click();
	 * 
	 * 
	 * 
	 * }
	 * 
	 * @When("purchase program") public void purchase_program() throws
	 * InterruptedException { Thread.sleep(2000); key.getWebElement("css",
	 * patientPanelLocator.date).sendKeys("05/02/2024"); key.getWebElement("css",
	 * patientPanelLocator.buy).click();
	 * 
	 * 
	 * }
	 * 
	 */

}