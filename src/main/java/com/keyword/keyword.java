package com.keyword;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

import com.base.Locator;
import com.base.config;
import com.error.Invalidbroswererror;

public class keyword {

	private static final String String = null;
	private static RemoteWebDriver driver = null;

	public static RemoteWebDriver getDriver() {
		return driver;
	}

	public void openBrowser(String Browsername) {

		if (Browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.out.println("chrome browser launch");
		} else if (Browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {

			throw new Invalidbroswererror(Browsername);
   
		}

	}
	
	

	public void getUrl(String url) {
		driver.get(url);
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	
		public  WebElement getWebElement(String locatorType,String locatorValue) {
			if (locatorType.equalsIgnoreCase("id")) {
				return driver.findElement(By.id(locatorValue));
				
			} else if (locatorType.equalsIgnoreCase("name")) {
				return driver.findElement(By.name(locatorValue));
			} else  if(locatorType.equalsIgnoreCase("css")){
				return driver.findElement(By.cssSelector(locatorValue));
			} else  if(locatorType.equalsIgnoreCase("id")){
				return driver.findElement(By.id(locatorValue));
			} else  if(locatorType.equalsIgnoreCase("tagname")){
				return driver.findElement(By.tagName(locatorValue));
			} else  if(locatorType.equalsIgnoreCase("xpath")){
				return driver.findElement(By.xpath(locatorValue));
			} else  if(locatorType.equalsIgnoreCase("linktext")){
				return driver.findElement(By.linkText(locatorValue));
			} else  if(locatorType.equalsIgnoreCase("partiallinktext")){
				return driver.findElement(By.partialLinkText(locatorValue));
			} else {
				throw new InvalidSelectorException(locatorType);
			}

	}

	public void enterText(String locatorType, String locatorValue, CharSequence... text) {
		getWebElement(locatorType, locatorValue).sendKeys(text);
	}
	
	public void implicitWait() {
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	public void webDriverWait(String locatorType,String locatorValue) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60),Duration.ofMillis(500));
		
		
	}
	public void clickOn(String locatorType,String locatorValue) {
		getWebElement(locatorType, locatorValue).click();

		
	}
	public void hitKey(int keycode) {
		 try {
			Robot robo=new Robot();
			robo.keyPress(keycode);
			robo.keyRelease(keycode);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	public void uploadAudio(String url) throws AWTException {
		
		 Robot rb=new Robot();
		  rb.delay(2000);
		  StringSelection ss=new StringSelection("C:\\Users\\Admin\\Desktop\\New folder\\Therperia background audio\\Sample wav file 8MB.mp3");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);//copy file into clipboard
		  rb.keyPress(KeyEvent.VK_CONTROL);
		  rb.keyPress(KeyEvent.VK_V);
		  rb.keyRelease(KeyEvent.VK_CONTROL);
		  rb.keyRelease(KeyEvent.VK_V);
		  rb.keyPress(KeyEvent.VK_ENTER);
		  rb.keyRelease(KeyEvent.VK_ENTER);
		  
	}
	public List<WebElement> getWebElements(String locatorType,String locatorValue){
		if (locatorType.equalsIgnoreCase("id")) {
			return driver.findElements(By.id(locatorValue));
			
		} else if (locatorType.equalsIgnoreCase("name")) {
			return driver.findElements(By.name(locatorValue));
		} else  if(locatorType.equalsIgnoreCase("css")){
			return driver.findElements(By.cssSelector(locatorValue));
		} else  if(locatorType.equalsIgnoreCase("id")){
			return driver.findElements(By.id(locatorValue));
		} else  if(locatorType.equalsIgnoreCase("tagname")){
			return driver.findElements(By.tagName(locatorValue));
		} else  if(locatorType.equalsIgnoreCase("xpath")){
			return driver.findElements(By.xpath(locatorValue));
		} else  if(locatorType.equalsIgnoreCase("linktext")){
			return driver.findElements(By.linkText(locatorValue));
		} else  if(locatorType.equalsIgnoreCase("partiallinktext")){
			return driver.findElements(By.partialLinkText(locatorValue));
		} else {
			throw new InvalidSelectorException(locatorType);
		}
}
	public void scrollPage() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void getwindowid() throws AWTException {
		 Robot newtab=new Robot();
		 newtab.delay(2000);
		  
		 newtab.keyPress(KeyEvent.VK_CONTROL);
		 newtab.keyPress(KeyEvent.VK_T);
		 newtab.keyRelease(KeyEvent.VK_CONTROL);
		 newtab.keyRelease(KeyEvent.VK_T);
		 newtab.keyPress(KeyEvent.VK_CONTROL);
		 newtab.keyPress(KeyEvent.VK_V);
		 newtab.keyRelease(KeyEvent.VK_CONTROL);
		 newtab.keyRelease(KeyEvent.VK_V);
		 newtab.keyPress(KeyEvent.VK_ENTER);

		 newtab.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void getwindowHandles() {
		Set<String>windowIds=driver.getWindowHandles();
		/*
		 * Iterator<String>it=windowIds.iterator();
		 * System.out.println("string parent Id is "+it.next());
		 * System.out.println("string child Id is "+it.next());
		 */
		List<String>windowIDsList=new ArrayList(windowIds);
		String parentWindow=windowIDsList.get(0);
		String chileWindow=windowIDsList.get(1);
		System.out.println(parentWindow);
		System.out.println(chileWindow);
		driver.switchTo().window(chileWindow);
		System.out.println("title of child window:"+driver.getTitle());
		
	}
	
	
	
	
}