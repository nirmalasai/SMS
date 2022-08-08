package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IngeniousDeveloperLinkPage {

	//initialization
	public IngeniousDeveloperLinkPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy (xpath = "//a[text()='Profile']")
	private WebElement profileButton;
	
	@FindBy (xpath = "//a[text()='Sign out']")
	private WebElement signoutButton;
	
	//utilization
	
	public WebElement getProfileButton() {
		return profileButton;
	}

	public WebElement getSignoutButton() {
		return signoutButton;
	}
	
	
	
}
