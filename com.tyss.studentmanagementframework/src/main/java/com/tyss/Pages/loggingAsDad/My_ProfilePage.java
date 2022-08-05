package com.tyss.Pages.loggingAsDad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_ProfilePage {

	//initialization
	public My_ProfilePage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//declaration
	@FindBy(xpath = "//i[@class='glyphicon glyphicon-edit']")
	private WebElement editButon;
	
	@FindBy (xpath = "//input[@name='full_name']")
	private WebElement fullNameTextField;
	
	@FindBy (name = "i_name")
	private WebElement nameWithInitialsTextField;
	
	@FindBy (id = "address1")
	private WebElement addressTextField;
	
	@FindBy (xpath = "//select[@name='gender']")
	private WebElement genderDropDown;
	
	@FindBy (id = "email1")
	private WebElement emailTextField;
	
	@FindBy (id = "phone1")
	private WebElement phoneNumberTextField;
	
	@FindBy (id = "password1")
	private WebElement passwordTextField;
	
	@FindBy (id = "fileToUpload")
	private WebElement chooseFileButton;
	
	@FindBy (id = "btnUpdate")
	private WebElement updateButton;

	
	//utilization
	public WebElement getEditButon() {
		return editButon;
	}

	public WebElement getFullNameTextField() {
		return fullNameTextField;
	}

	public WebElement getNameWithInitialsTextField() {
		return nameWithInitialsTextField;
	}

	public WebElement getAddressTextField() {
		return addressTextField;
	}

	public WebElement getGenderDropDown() {
		return genderDropDown;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getChooseFileButton() {
		return chooseFileButton;
	}

	public WebElement getUpdateButton() {
		return updateButton;
	}
}
