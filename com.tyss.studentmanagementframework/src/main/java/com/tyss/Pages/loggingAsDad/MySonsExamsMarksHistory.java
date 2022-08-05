package com.tyss.Pages.loggingAsDad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MySonsExamsMarksHistory {

	
	//initialization
	public MySonsExamsMarksHistory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy (xpath = "//a[@href=\"my_sons_exam_marks_history.php\"]")
	private WebElement MySonsExamsMarksHistoryLink;
	
	@FindBy (name = "year" )
	private WebElement  yearDropDown;
	
	@FindBy (name = "exam")
	private WebElement examDropDown;
	
	@FindBy (xpath = "//button[text()='Submit']")
	private WebElement submitButton;

	
	//utilization
	public WebElement getMySonsExamsMarksHistoryLink() {
		return MySonsExamsMarksHistoryLink;
	}

	public WebElement getYearDropDown() {
		return yearDropDown;
	}

	public WebElement getExamDropDown() {
		return examDropDown;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
}
