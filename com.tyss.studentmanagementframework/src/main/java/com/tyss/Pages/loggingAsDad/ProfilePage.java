package com.tyss.Pages.loggingAsDad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

	//initialization
	public ProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy (xpath = "//a[@href=\"parents_profile.php\"]")
	private WebElement myProfileLink;
	
	@FindBy (xpath = "//a[@href=\"my_sons_profile.php\"]")
	private WebElement mySonsProfileLink;

	//utilization
	public WebElement getMyProfileLink() {
		return myProfileLink;
	}

	public WebElement getMySonsProfileLink() {
		return mySonsProfileLink;
	}
	

	
	
}
