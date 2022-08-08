package com.tyss.Pages.loggingAsDad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MySonsTeacherPage {
 
	//initialization
	public MySonsTeacherPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy (xpath = "//a[@href=\"my_sons_teacher.php\"]")
	private WebElement mySonsTeacherLink;
	
	@FindBy (xpath = "//input[@type='search']")
	private WebElement searchTextField;
	
	@FindBy (xpath = "//a[@class='btn btn-primary btn-xs']")
	private WebElement viewProfileButton;
	
	@FindBy (xpath = "//a[@class='btn btn-success btn-xs']")
	private WebElement somethingButton;
	
	@FindBy (name = "example1_length")
	private WebElement showDropDown;
	
	@FindBy (xpath = "//a[text()='Previous']")
	private WebElement previousLink;
	
	@FindBy (xpath = "//a[text()='Next']")
	private WebElement nextLink;
	
	
    //utilization
	public WebElement getMySonsTeacherLink() {
		return mySonsTeacherLink;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getViewProfileButton() {
		return viewProfileButton;
	}

	public WebElement getSomethingButton() {
		return somethingButton;
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
