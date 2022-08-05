package com.tyss.Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import com.google.protobuf.ByteString.Output;

public class WebDriverUtility {
	/**
	 * to maximize the browser
	 * 
	 * @param driver
	 */
	public void maximizeTheBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * this method is used to enter url
	 * @param driver
	 * @param url
	 */
	public void navigateApp(WebDriver driver,String url)
	{
		driver.get(url);
	}

	/**
	 * to minimize the browser
	 * 
	 * @param driver
	 */
	public void minimizeTheDriver(WebDriver driver) {
		driver.manage().window().minimize();
	}

	/**
	 * to refresh the page
	 * 
	 * @param driver
	 */
	public void refreshThePage(WebDriver driver) {
		driver.navigate().refresh();
	}

	/**
	 * back to previous page
	 * 
	 * @param driver
	 */
	public void backToPreviousPage(WebDriver driver) {
		driver.navigate().back();
	}

	/**
	 * forward to next page
	 * 
	 * @param driver
	 */
	public void forwardToNextPage(WebDriver driver) {
		driver.navigate().forward();
	}

	/**
	 * this method will wait till page gets load
	 * 
	 * @param driver
	 */
	public void waitTillPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IConstants.implictlywaitDuration));
	}

	/**
	 * this method will wait till element to click
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitTillElementToClick(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IConstants.explicitlywaitduration));
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	/**
	 * this method will wait till element visible
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitTillElementToVisible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IConstants.explicitlywaitduration));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * this method will wait for title of the page
	 * 
	 * @param driver
	 * @param title
	 */
	public void waitTillPageLoadTitle(WebDriver driver, String title) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IConstants.explicitlywaitduration));
		wait.until(ExpectedConditions.titleContains(title));
	}

	/**
	 * this method will wait till page load url
	 * 
	 * @param driver
	 * @param URL
	 */
	public void waitTillPageLoadURL(WebDriver driver, String URL) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IConstants.explicitlywaitduration));
		wait.until(ExpectedConditions.urlContains(URL));
	}

	/**
	 * this method will ignore no such element exception
	 * 
	 * @param driver
	 */
	public void ignoreNoSuchElementException(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IConstants.explicitlywaitduration));
		wait.ignoring(NoSuchElementException.class);
	}

	/**
	 * this method will wait till the alert msg to be visible
	 * 
	 * @param driver
	 */
	public void waitForAlertMsg(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IConstants.explicitlywaitduration));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	/**
	 * switching to frame using index
	 * 
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * switching to frame using id
	 * 
	 * @param driver
	 * @param id
	 */
	public void switchToFrame(WebDriver driver, String id) {
		driver.switchTo().frame(id);
	}

	/**
	 * switching to frame using element
	 * 
	 * @param driver
	 * @param element
	 */
	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	/**
	 * switching to main frame
	 * 
	 * @param driver
	 */
	public void switchToMainFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	/**
	 * this method is used to select element in dropdown using index
	 * 
	 * @param element
	 * @param index
	 */
	public void select(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * this method is used to select element in dropdown using value
	 * 
	 * @param element
	 * @param value
	 */
	public void select(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	/**
	 * this method is used to select element in dropdown using visible text
	 * 
	 * @param element
	 * @param value
	 */
	public void select(String text, WebElement element) {
		Select select = new Select(element);
		select.selectByValue(text);
	}

	/**
	 * this method is used to fetch all the options from the dropdown
	 * 
	 * @param element
	 */
	public void getAllTheOptiosFromDropdown(WebElement element) {
		Select select = new Select(element);
		List<WebElement> option = select.getOptions();
		for (WebElement webelement : option) {
			String text = webelement.getText();
			System.out.println(text);
		}

	}

	/**
	 * this method is used to mouseover on an element
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseOverOnElement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	/**
	 * this method is used to right click on element
	 * 
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	/**
	 * this method is used to doubleclick on an element
	 * 
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	/**
	 * this method is used to click on enter key
	 * 
	 * @param driver
	 * @param element
	 */
	public void clickOnEnterKey(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
	}

	/**
	 * this method is used to take screenshot
	 * 
	 * @param driver
	 * @param element
	 * @return 
	 */
	public static String takeScreenShot(WebDriver driver, String screenShotName) {
		TakesScreenshot takescreenShot = (TakesScreenshot) driver;
		File src = takescreenShot.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenShots/" + screenShotName + ".PNG");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return screenShotName;
	}
	/**
	 * this method is used for custom wait
	 * 
	 * @param element
	 * @param duration
	 * @param pollingTime
	 */

	public void waitAndClickUsingCustomWait(WebDriver driver) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofSeconds(10));
		wait.ignoring(NoSuchElementException.class);
		try {
			wait.wait(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * this method is used for custom wait
	 * 
	 * @param element
	 * @param duration
	 * @param pollingTime
	 */
	public void waitAndClick(WebElement element, int duration, long pollingTime) {
		int count = 0;
		while (count < duration) {
			try {
				element.click();
				break;
			} catch (Exception e) {
				try {
					Thread.sleep(pollingTime);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				count++;
			}
		}
	}

	/**
	 * this method is used to switch to window using title
	 * 
	 * @param driver
	 * @param actualTitle
	 */
	public void switchToWindow(WebDriver driver, String actualTitle) {
		Set<String> set = driver.getWindowHandles();
		for (String string : set) {
			driver.switchTo().window(string);
			String title = driver.getTitle();
			if (title.contains(actualTitle)) {
				break;
			}
		}
	}

	/**
	 * this method is used to switch to window using URL
	 * 
	 * @param driver
	 * @param actualTitle
	 */
	public void switchToWindow(String actualURL, WebDriver driver) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String wID = it.next();
			driver.switchTo().window(wID);
			String url = driver.getCurrentUrl();
			if (url.contains(actualURL)) {
				break;
			}
		}
	}

	/**
	 * this method is used to switch alert popup and accept the popup
	 * 
	 * @param driver
	 * @param expectedMsg
	 */
	public void switchToAlertPopupandAccept(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
//		if (alert.getText().trim().equalsIgnoreCase(expectedMsg.trim())) {
//			System.out.println("alert msg is verified");
//		} else {
//			System.out.println("alert msg is not verified");
//		}
		alert.accept();
	}

	/**
	 * this method is used to switch alert popup and dismiss the popup
	 * 
	 * @param driver
	 * @param expectedMsg
	 */
	public void switchToAlertPopupandDismiss(String expectedMsg, WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		if (alert.getText().trim().equalsIgnoreCase(expectedMsg)) {
			System.out.println("alert msg is verified");
		} else {
			System.out.println("alert msg is not verified");
		}
		alert.dismiss();
	}

}
