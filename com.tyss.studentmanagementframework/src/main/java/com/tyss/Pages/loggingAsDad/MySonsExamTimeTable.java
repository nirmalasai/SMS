package com.tyss.Pages.loggingAsDad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MySonsExamTimeTable {

	//initialization
	public MySonsExamTimeTable(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy (xpath ="//a[@href=\"my_sons_exam_timetable.php\"]")
	private WebElement mySonsExamTimeTableLink;
	
	@FindBy (name = "exam")
	private WebElement examDropDown;
	
	@FindBy (xpath = "//button[text()='Submit']")
	private WebElement submitButton;

	//utilization
	public WebElement getMySonsExamTimeTableLink() {
		return mySonsExamTimeTableLink;
	}

	public WebElement getExamDropDown() {
		return examDropDown;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
	
}
