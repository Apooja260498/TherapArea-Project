package com.test.Login;

import java.awt.event.KeyEvent;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.base.dignosis_Locator;
import com.keyword.keyword;

public class Diagnosis extends TestBase{
	@Test
	public void createNewDiagnosis() throws InterruptedException {
		
		Thread.sleep(1000);
		keyword key = new keyword();
		
		key.clickOn("css", dignosis_Locator.dignosis);
		Thread.sleep(2000);
		key.clickOn("css", dignosis_Locator.createNewDiagnosis);
		Thread.sleep(2000);
		key.clickOn("css", dignosis_Locator.selectPatientName);
		key.hitKey(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		key.clickOn("css",dignosis_Locator.selectAllQuiz);
		key.scrollPage();
		Thread.sleep(2000);
		key.clickOn("css", dignosis_Locator.NextdiagnosisPage);
		Thread.sleep(2000);

		
	}
	@Test
	public void fillDiagnosis() throws InterruptedException {
		Thread.sleep(1000);
		keyword key = new keyword();
		
		key.clickOn("css", dignosis_Locator.dignosis);
		Thread.sleep(2000);
		//key.clickOn("css",dignosis_Locator.editDiagnosis);
		System.out.println(key.getWebElement("css", dignosis_Locator.tableHeading).getText());
	

}
}