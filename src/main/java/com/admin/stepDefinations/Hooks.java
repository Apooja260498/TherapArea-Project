package com.admin.stepDefinations;

import org.testng.annotations.BeforeClass;

import com.base.Locator;
import com.base.config;
import com.base.patientPanelLocator;
import com.keyword.keyword;

import io.cucumber.java.Before;

public class Hooks {
	keyword key=new keyword();
	@Before
	public void setUp() throws Exception {
		key.openBrowser(config.getBrowsername());
		key.getUrl("https://therapstgapp.promactinfo.xyz/");
		key.maximizeWindow();
		key.implicitWait();
		
		
	}
}
