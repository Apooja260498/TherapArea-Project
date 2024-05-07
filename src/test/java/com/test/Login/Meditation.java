package com.test.Login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.Locator;
import com.base.TestBase;
import com.keyword.keyword;
import com.wait.waitFor;

public class Meditation extends TestBase {
	@Test
	public void backgroundAudio() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		keyword key = new keyword();
		key.clickOn("css", Locator.Meditation);
		Thread.sleep(1000);

		key.clickOn("css", Locator.uploadBackgroundMeditation);
		Thread.sleep(2000);
		key.getWebElement("css", Locator.backgroundAudioTitle).sendKeys("background audio new 5 auto");
		key.getWebElement("css", Locator.uploadBackgroundAudio).click();

		key.uploadAudio(
				"C:\\Users\\Admin\\eclipse-workspace\\project.therapArea\\background audio\\file_example_MP3_2MG.mp3");
		System.out.println("submit");
		waitFor.elementtobeclickable("css", Locator.submitBackgroundAudio);

		key.getWebElement("css", Locator.submitBackgroundAudio).submit();

	}

	@Test

	public void guidedMeditationAudio() throws InterruptedException, AWTException {

		Thread.sleep(1000);
		keyword key = new keyword();
		key.clickOn("css", Locator.Meditation);
		Thread.sleep(1000);
		key.getWebElement("css", Locator.createGuidedMeditation).click();
		key.getWebElement("css", Locator.enterguidedAudioName).sendKeys("guided audio new auto 1");
		key.getWebElement("css", Locator.enterdescription)
				.sendKeys("this is guided meditation audio need to test some audio");
		Thread.sleep(2000);
		key.clickOn("css", Locator.selectLanguague);
		key.hitKey(KeyEvent.VK_ENTER);

		Select catagory = new Select(key.getWebElement("css", Locator.catagory));
		catagory.selectByValue("3a11f38b-b1ee-d40d-6d86-2cc5b0289d0e");

		Select mediatationOption = new Select(key.getWebElement("xpath", Locator.guidedmeditationOption));
		mediatationOption.selectByValue("0");
		key.clickOn("css", Locator.uploadGuidedMeditationAudio);
		key.uploadAudio(
				"C:\\Users\\Admin\\Desktop\\New folder\\Guided meditation audio\\hare-krishna-relaxing-theme-4-114482.mp3");

		key.scrollPage();
		waitFor.elementtobeclickable("css", Locator.submitguidedmeditation);

		key.getWebElement("css", Locator.submitguidedmeditation).submit();

	}

	@Test
	public void createProgram() throws InterruptedException {
		Thread.sleep(1000);
		keyword key = new keyword();
		key.clickOn("css", Locator.Meditation);
		Thread.sleep(1000);
		key.getWebElement("css", Locator.crprogramNameeateNewProgram).click();
		Thread.sleep(1000);

		key.getWebElement("css", Locator.catagoryforProgram).click();

		key.hitKey(KeyEvent.VK_ENTER);
		key.getWebElement("css", Locator.programName).sendKeys("new program 2 auto");
		key.getWebElement("css", Locator.programDescription).sendKeys("this is my new program for automation");
		key.getWebElement("css", Locator.programFees).sendKeys("10");

		key.scrollPage();
		key.getWebElement("css", Locator.audio).click();

		Select iteration = new Select(key.getWebElement("css", Locator.selectIteration));
		iteration.selectByValue("2");
		Select frequence = new Select(key.getWebElement("css", Locator.selectFrequency));
		frequence.selectByValue("6");
		key.getWebElement("css", Locator.saveProgram).click();
		key.getWebElement("css", Locator.addProgram).click();

	}
	@Test
	public void assignProgram() throws InterruptedException {
		Thread.sleep(1000);
		keyword key = new keyword();
		key.clickOn("css", Locator.Meditation);
		Thread.sleep(1000);
		key.clickOn("css", Locator.assignProgram);
		key.getWebElement("css", Locator.selectProgramDate).click();
	}

}
