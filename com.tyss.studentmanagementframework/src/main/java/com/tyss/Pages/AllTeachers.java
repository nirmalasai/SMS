package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllTeachers {
	
	public AllTeachers(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement searchEdt;
	
	
	@FindBy(xpath="//a[text()='Edit']")
	private WebElement editBtn;
	
	@FindBy(id="full_name1")
	private WebElement fullnameEdt;
	
	@FindBy(id="i_name1")
	private WebElement nameIntialEdt;
	
	@FindBy(id="address1")
	private WebElement addressEdt;
	
	@FindBy(id="gender1")
	private WebElement genderEdt;
	
	@FindBy(id="phone1")
	private WebElement phonenoEdt;
	
	@FindBy(id="email1")
	private WebElement emailEdt;
	
	@FindBy(id="fileToUpload1")
	private WebElement photoEdt;
	
	@FindBy(id="btnSubmit1")
	private WebElement submitEdt;
	
	public WebElement getSubmitEdt() {
		return submitEdt;
	}

	public WebElement getSearchEdt() {
		return searchEdt;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getFullnameEdt() {
		return fullnameEdt;
	}

	public WebElement getNameIntialEdt() {
		return nameIntialEdt;
	}

	public WebElement getAddressEdt() {
		return addressEdt;
	}

	public WebElement getGenderEdt() {
		return genderEdt;
	}

	public WebElement getPhonenoEdt() {
		return phonenoEdt;
	}

	public WebElement getEmailEdt() {
		return emailEdt;
	}

	public WebElement getPhotoEdt() {
		return photoEdt;
	}
	
	public void editFullName(String editFN)
	{
		fullnameEdt.sendKeys(editFN);
	}
	
	public void editNameIntial(String editNameIntial)
	{
		nameIntialEdt.sendKeys(editNameIntial);
	}
	
	public void editAddress(String editAddr)
	{
		addressEdt.sendKeys(editAddr);
	}
	
	public void editPhNo(String editPhno)
	{
		addressEdt.sendKeys(editPhno);
	}
	
	public void editEmail(String emailEdit)
	{
		emailEdt.sendKeys(emailEdit);
	}
	public void editPhoto(String editPath)
	{
		photoEdt.sendKeys(editPath);
	}
}
