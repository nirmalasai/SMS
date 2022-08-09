package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddStudent {
	public AddStudent(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="index_number")private WebElement indexEdt;
	
	@FindBy(id="full_name")private WebElement fullNameEdt;
	
	@FindBy(id="i_name")private WebElement nameWithInitialEdt;
	
	@FindBy(id="address")private WebElement addressEdt;
	
	@FindBy(id="email")private WebElement emailIdEdt;
	
	@FindBy(name="phone")private WebElement phnoEdt;
	
	@FindBy(name="b_date")private WebElement birthDayEdt;
	
	@FindBy(name="gender")private WebElement genderDropDwn;
	
	@FindBy(id="fileToUpload")private WebElement fileToUploadEdt;
	
	@FindBy(name="g_full_name")private WebElement guardianEdt;
	
	
	

}
