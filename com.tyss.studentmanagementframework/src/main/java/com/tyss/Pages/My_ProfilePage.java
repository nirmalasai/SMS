package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_ProfilePage {

	//initialization
	public My_ProfilePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy (xpath = "//a[@id='btnEdit']")
	private WebElement editButton;
	
	//utilization
	public WebElement getEditButton() {
		return editButton;
	}
}
