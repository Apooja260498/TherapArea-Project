package com.test.Login;

import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.base.Locator;
import com.base.TestBase;
import com.base.config;
import com.keyword.keyword;
import com.wait.waitFor;

public class Login extends TestBase {
	@Test

	public void Login() throws InterruptedException {

		keyword obj = new keyword();

		obj.enterText("css", Locator.userName, config.getEmail());
		obj.enterText("css", Locator.passWord, config.getPassword());
		obj.clickOn("css", Locator.logIn);
		System.out.println(obj.getWebElement("css", Locator.toaster).getText());
		// waitFor.elementisvisible("css",Locator.patient);
		Thread.sleep(1000);
		obj.clickOn("css", Locator.patient);
		Thread.sleep(1000);
		obj.clickOn("css", Locator.addPatient);
		obj.getWebElement("css", Locator.firstName).sendKeys("karan");
		obj.getWebElement("css", Locator.lastName).sendKeys("pandey");
		obj.getWebElement("css", Locator.pEmail).sendKeys("poojazoman+karanp@promactinfo.com");
		obj.getWebElement("css", Locator.pContact).sendKeys("5236832658");
		obj.clickOn("css", Locator.savePatient);
		Thread.sleep(1000);
		obj.hitKey(KeyEvent.VK_CONTROL);
		obj.hitKey(KeyEvent.VK_T);

	}
}