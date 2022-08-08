package com.tyss.Pages.loggingAsDad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MySonsExamPage {

	//initialization
	public MySonsExamPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy (xpath = "//a[@href=\"my_sons_exam_marks.php\"]")
	private WebElement mySonsExamLink;
	
	@FindBy (name = "exam")
	private WebElement selectDropDown;
	
	@FindBy (xpath = "//button[text()='Submit']")
	private WebElement submitbutton;

	
	//utilization
	public WebElement getMySonsExamLink() {
		return mySonsExamLink;
	}

	public WebElement getSelectDropDown() {
		return selectDropDown;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	
	
	
}
