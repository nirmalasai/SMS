package com.tyss.Pages.loggingAsDad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllSubjectsPage {

	//initialization
	public AllSubjectsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy (xpath = "//input[@type='search']")
	private WebElement searchBox;
	
	@FindBy (name = "example1_length")
	private WebElement showDropDown;
	
	@FindBy (xpath = "//a[text()='Previous']")
	private WebElement previousLink;
	
	@FindBy (xpath = "//a[text()='Next']")
	private WebElement nextLink;

	
	//utilization
	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getShowDropDown() {
		return showDropDown;
	}

	public WebElement getPreviousLink() {
		return previousLink;
	}

	public WebElement getNextLink() {
		return nextLink;
	}
	
	
	
}
