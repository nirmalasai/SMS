package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.Utilities.WebDriverUtility;

public class AdminTimetable extends WebDriverUtility {
	
	//Initilization
	public AdminTimetable(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Declaration
	
	@FindBy(name="grade")private WebElement gradeDropDwn;
	
	@FindBy(linkText="Submit")private WebElement submitBtn;
	
	//utilization
	public WebElement getGradeDropDwn() {
		return gradeDropDwn;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	public void timeTable()
	{
		submitBtn.click();
	}
	
	
	

}
