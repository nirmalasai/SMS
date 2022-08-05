package com.tyss.Pages.loggingAsDad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllTimeTablePage {

	//initialization
	public AllTimeTablePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy (xpath = "//a[@href=\"all_timetable3.php\"]")
	private WebElement allTimeTabelLink;

	//utilization
	public WebElement getAllTimeTabelLink() {
		return allTimeTabelLink;
	}	
}
