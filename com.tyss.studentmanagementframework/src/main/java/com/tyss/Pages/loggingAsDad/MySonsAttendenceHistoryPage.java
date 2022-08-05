package com.tyss.Pages.loggingAsDad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MySonsAttendenceHistoryPage {

	//initialization
	public MySonsAttendenceHistoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy (xpath = "//a[@href=\"my_sons_attendance_history.php\"]")
	private WebElement mySonsAttendenceHistoryLink;
	
	@FindBy(name = "year")
	private WebElement yearDropDown;
	
	@FindBy (name = "month")
	private WebElement monthDropDown;
	
	@FindBy (name = "//button[text()='Submit']")
	private WebElement submitButton;

	//utilization
	public WebElement getMySonsAttendenceHistoryLink() {
		return mySonsAttendenceHistoryLink;
	}

	public WebElement getYearDropDown() {
		return yearDropDown;
	}

	public WebElement getMonthDropDown() {
		return monthDropDown;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
}
