package com.tyss.Pages.loggingAsDad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllTeachersPage {

	//initialization
	public AllTeachersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy (xpath = "//a[@href=\"all_teacher3.php\"]")
	private WebElement allTeachersLink;
	
	@FindBy (xpath = "//input[@type='search']")
	private WebElement searchTextBox;
	
	@FindBy (xpath = "//select[@name='example1_length']")
	private WebElement showDropDown;
	
	@FindBy (xpath = "//a[text()='View Profile']")
	private WebElement viewProfileButton;
	
	@FindBy (xpath = "//a[text()='Something']")
	private WebElement somethingButton;
	
	@FindBy (xpath = "//a[text()='Previous']")
	private WebElement previousLink;
	
	@FindBy (xpath = "//a[text()='Next']")
	private WebElement nextLink;

	//utilization
	public WebElement getAllTeachersLink() {
		return allTeachersLink;
	}

	public WebElement getSearchTextBox() {
		return searchTextBox;
	}

	public WebElement getShowDropDown() {
		return showDropDown;
	}

	public WebElement getViewProfileButton() {
		return viewProfileButton;
	}

	public WebElement getSomethingButton() {
		return somethingButton;
	}

	public WebElement getPreviousLink() {
		return previousLink;
	}

	public WebElement getNextLink() {
		return nextLink;
	}
	
	
}
