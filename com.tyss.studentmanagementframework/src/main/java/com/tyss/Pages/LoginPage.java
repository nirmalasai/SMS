package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.Utilities.FileUtility;

public class LoginPage {
	//declaration
	@FindAll({@FindBy(xpath = "//input[@type='text']"),@FindBy(name = "user_n")}) private WebElement usernametxtEdt;
	//@FindBys({@FindBy(xpath = "//input[@type='text']"),@FindBy(name = "user_name")})
	//private WebElement usernametxtEdt;

	@FindBy(id="password")
	private WebElement passwordtxtEdt;


	@FindBy(id="btnSubmit")
	private WebElement submitBtn;

	private CharSequence username;

	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//Utilization
	public WebElement getUsernametxtEdt()
	{
		return usernametxtEdt;
	}

	public WebElement getPasswordtxtEdt() {
		return passwordtxtEdt;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	/**
	 * 
	 * @param password 
	 * @param username
	 * @param password
	 * click on submit button
	 */

	public void loginToAppli(String username, String password)
	{
		usernametxtEdt.sendKeys(username);
		passwordtxtEdt.sendKeys(password);
		submitBtn.click();
	}
}
