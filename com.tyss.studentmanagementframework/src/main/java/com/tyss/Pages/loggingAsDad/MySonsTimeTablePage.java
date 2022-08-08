package com.tyss.Pages.loggingAsDad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MySonsTimeTablePage {

	//initialization
	public MySonsTimeTablePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//@declaration
	@FindBy (xpath = "//a[@href=\"my_sons_timetable.php\"]")
	private WebElement mySonsTimeTableLink;

	//utilization
	public WebElement getMySonsTimeTableLink() {
		return mySonsTimeTableLink;
	}
	
	
}
