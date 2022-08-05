package com.tyss.Pages.loggingAsDad;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MySonsSubjectPage {

	//initialization
	public MySonsSubjectPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy (xpath = "//a[@href=\"my_sons_subject.php\"]")
	private WebElement MySonsSubjectLink;
	
	@FindBy (name="example1_length")
	private WebElement showDorpDown;
	
	@FindBy (xpath = "//input[@class='form-control input-sm']")
	private WebElement searchTextfield;
	
	@FindBy (xpath = "//a[text()='Previous']")
	private WebElement previousLink;
	
	@FindBy (xpath = "//a[text()='Next']")
	private WebElement nextLink;

	//utilization
	public WebElement getMySonsSubjectLink() {
		return MySonsSubjectLink;
	}

	public WebElement getShowDorpDown() {
		return showDorpDown;
	}

	public WebElement getSearchTextfield() {
		return searchTextfield;
	}

	public WebElement getPreviousLink() {
		return previousLink;
	}

	public WebElement getNextLink() {
		return nextLink;
	}
	
	
}
