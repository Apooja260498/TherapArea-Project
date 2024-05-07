package com.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.keyword.keyword;

public class TestBase {

	keyword key = new keyword();

	@BeforeMethod

	public void setUp() {
		key.openBrowser(config.getBrowsername());
		key.getUrl("https://therapstgapp.promactinfo.xyz/login");
		key.maximizeWindow();
		key.implicitWait();
		/*
		 * key.enterText("css", Locator.userName, config.getEmail());
		 * key.enterText("css", Locator.passWord, config.getPassword());
		 * key.clickOn("css", Locator.logIn);
		 * System.out.println(key.getWebElement("css", Locator.toaster).getText());
		 */

	}
	
	
	/*
	 * public void patientPanelSetUp() { key.openBrowser(config.getBrowsername());
	 * key.getUrl("https://therapstgapp.promactinfo.xyz/login");
	 * key.maximizeWindow(); key.implicitWait(); key.enterText("css",
	 * patientPanelLocator.patientEmail, config.getAdminEmail());
	 * key.enterText("css", patientPanelLocator.patientPassword,
	 * config.getAdminPassword()); key.clickOn("css",
	 * patientPanelLocator.loginPatient);
	 * System.out.println(key.getWebElement("css", Locator.toaster).getText()); }
	 */
	
	

}