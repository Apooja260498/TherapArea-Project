package com.test.Login;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.base.Locator;
import com.base.TestBase;
import com.base.addNewPatient;
import com.keyword.keyword;

public class scehduleAppointment extends TestBase {
	keyword obj = new keyword();

	@Test
	public void addPatient() throws InterruptedException, AWTException {

		Thread.sleep(1000);
		obj.clickOn("css", Locator.patient);
		Thread.sleep(1000);
		obj.clickOn("css", Locator.addPatient);
		obj.getWebElement("css", Locator.firstName).sendKeys("rachna");
		;
		obj.getWebElement("css", Locator.lastName).sendKeys("patel");
		;
		obj.getWebElement("css", Locator.pEmail).sendKeys("poojazoman+rachna@promactinfo.com");
		;
		obj.getWebElement("css", Locator.pContact).sendKeys("45389357271");
		;
		obj.getWebElement("css", Locator.savePatient).click();
		obj.getwindowid();
		Thread.sleep(2000);
		obj.getwindowHandles();
		

		Thread.sleep(3000);
		System.out.println(obj.getWebElement("css", "div[class='fw-bold font-size-for-26px'] div").getText());
		obj.getWebElement("css", addNewPatient.createPassword).sendKeys("Promact@123");
		obj.getWebElement("css", addNewPatient.reEnterPassword).sendKeys("Promact@123");
		obj.getWebElement("css", addNewPatient.birthdate).sendKeys("04/23/2024");
		obj.getWebElement("css", addNewPatient.Street).sendKeys("Israel");
		obj.getWebElement("css", addNewPatient.city).click();
		obj.getWebElement("xpath",
				"/html/body/theraparea-client-root/section/theraparea-client-patient-signup/section/div/div/div[2]/div/div/div[4]/form/div[6]/div[4]/div[2]/ng-select/ng-dropdown-panel/div/div[2]/div[2]")
				.click();
		WebElement currency = obj.getWebElement("css", addNewPatient.currency);
		Select cur = new Select(currency);
		cur.selectByValue("USD");
		obj.scrollPage();
		Thread.sleep(2000);
		obj.getWebElement("css", addNewPatient.submitPatient).click();
		Thread.sleep(2000);
		Select languague=new Select(obj.getWebElement("css", addNewPatient.languague));
		languague.selectByValue("en");
		Thread.sleep(2000);
		obj.clickOn("css", addNewPatient.update);

	}

	@Test
	public void window() throws InterruptedException {

	}

	@Test
	public void scehduleAppointment() throws InterruptedException {
		Thread.sleep(1000);
		obj.clickOn("css", Locator.patient);
		Thread.sleep(1000);
		obj.clickOn("css", Locator.Schedule);
		WebElement dropdown = obj.getWebElement("css", Locator.selectServices);
		Select service = new Select(dropdown);
		service.selectByIndex(1);

	}
}