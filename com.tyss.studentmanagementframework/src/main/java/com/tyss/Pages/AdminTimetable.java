package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminTimetable {
	
	//Initilization
	public AdminTimetable(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Declaration
	
	@FindBy(name="grade")private WebElement gradeDropDwn;
	
	@FindBy(linkText="Submit")private WebElement submitBtn;
	
	
	

}
