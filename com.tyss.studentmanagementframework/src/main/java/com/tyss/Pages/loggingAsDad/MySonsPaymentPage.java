package com.tyss.Pages.loggingAsDad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MySonsPaymentPage {

	//initialization
	public MySonsPaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy (name = "example1_length")
	private WebElement showDropDown;
	
	@FindBy (xpath = "//input[@type='search']")
	private WebElement searchBox; 
	
	@FindBy (xpath = "//a[text()='View Details']")
	private WebElement viewProfileButton;
	
	@FindBy (xpath = "//a[text()='View Invoice']")
	private WebElement viewInvoice;
	
	@FindBy (xpath = "//a[text()='Previous']")
	private WebElement previousLink;
	
	@FindBy (xpath = "//a[text()='Next']")
	private WebElement nextLink;

	//utilization
	public WebElement getShowDropDown() {
		return showDropDown;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getViewProfileButton() {
		return viewProfileButton;
	}

	public WebElement getViewInvoice() {
		return viewInvoice;
	}

	public WebElement getPreviousLink() {
		return previousLink;
	}

	public WebElement getNextLink() {
		return nextLink;
	}	
}
