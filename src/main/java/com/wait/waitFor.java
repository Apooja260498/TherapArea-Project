package com.wait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.keyword.keyword;

public class waitFor {

	private static FluentWait wait = null;
	static {

		wait=new FluentWait<WebDriver>(keyword.getDriver());
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withTimeout(Duration.ofSeconds(120));
		wait.ignoring(NoSuchElementException.class);


	}

	public static void elementtobeclickable(String locatorType, String locatorValue) {
		By element = null;
		if (locatorType.equalsIgnoreCase("id")) {
			element=By.id(locatorValue);
		} else if (locatorType.equalsIgnoreCase("name")) {
			element=By.name(locatorValue);
		} else if (locatorType.equalsIgnoreCase("css")) {
			element=By.cssSelector(locatorValue);
		} else if (locatorType.equalsIgnoreCase("id")) {
			element=By.id(locatorValue);
		} else if (locatorType.equalsIgnoreCase("tagname")) {
			element=By.tagName(locatorValue);
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			element=By.xpath(locatorValue);
		} else if (locatorType.equalsIgnoreCase("linktext")) {
			element=By.linkText(locatorValue);
		} else if (locatorType.equalsIgnoreCase("partiallinktext")) {
			element=By.partialLinkText(locatorValue);
		} else {
			throw new InvalidSelectorException(locatorType);
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void presenceofElement(String locatorType, String locatorValue) {
		By element = null;
		if (locatorType.equalsIgnoreCase("id")) {
			element=By.id(locatorValue);
		} else if (locatorType.equalsIgnoreCase("name")) {
			element=By.name(locatorValue);
		} else if (locatorType.equalsIgnoreCase("css")) {
			element=By.cssSelector(locatorValue);
		} else if (locatorType.equalsIgnoreCase("id")) {
			element=By.id(locatorValue);
		} else if (locatorType.equalsIgnoreCase("tagname")) {
			element=By.tagName(locatorValue);
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			element=By.xpath(locatorValue);
		} else if (locatorType.equalsIgnoreCase("linktext")) {
			element=By.linkText(locatorValue);
		} else if (locatorType.equalsIgnoreCase("partiallinktext")) {
			element=By.partialLinkText(locatorValue);
		} else {
			throw new InvalidSelectorException(locatorType);
		}
		
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}
	
	public static void visibilityofElement(String locatorType, String locatorValue) {
		By element = null;
		if (locatorType.equalsIgnoreCase("id")) {
			element=By.id(locatorValue);
		} else if (locatorType.equalsIgnoreCase("name")) {
			element=By.name(locatorValue);
		} else if (locatorType.equalsIgnoreCase("css")) {
			element=By.cssSelector(locatorValue);
		} else if (locatorType.equalsIgnoreCase("id")) {
			element=By.id(locatorValue);
		} else if (locatorType.equalsIgnoreCase("tagname")) {
			element=By.tagName(locatorValue);
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			element=By.xpath(locatorValue);
		} else if (locatorType.equalsIgnoreCase("linktext")) {
			element=By.linkText(locatorValue);
		} else if (locatorType.equalsIgnoreCase("partiallinktext")) {
			element=By.partialLinkText(locatorValue);
		} else {
			throw new InvalidSelectorException(locatorType);
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	
	

}
}