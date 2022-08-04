package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.Utilities.ExcelUtility;
import com.tyss.Utilities.WebDriverUtility;

public class TeacherPage {
	//initialization
	public TeacherPage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	//declaration
	@FindBy(id = "index_number")
	private WebElement indexnumberTxt;
	@FindBy(id = "full_name")
	private WebElement fullnameText;
	@FindBy(id = "i_name")
	private WebElement namewithinitialTxt;
	@FindBy(id = "address")
	private WebElement addressTxt;
	@FindBy(id = "gender")
	private WebElement genderSelect;
	@FindBy (id = "phone")
	private WebElement phoneTxt;
	@FindBy(id = "email")
	private WebElement emailTxt;
	@FindBy(id = "fileToUpload")
	private WebElement photoUpload;
	@FindBy(id = "btnSubmit")
	private WebElement submitBtn;
//utilization
	public WebElement getIndexnumberTxt() {
		return indexnumberTxt;
	}
	public WebElement getFullnameText() {
		return fullnameText;
	}
	public WebElement getNamewithinitialTxt() {
		return namewithinitialTxt;
	}
	public WebElement getAddressTxt() {
		return addressTxt;
	}
	public WebElement getGenderSelect() {
		return genderSelect;
	}
	public WebElement getPhoneTxt() {
		return phoneTxt;
	}
	public WebElement getEmailTxt() {
		return emailTxt;
	}
	public WebElement getPhotoUpload() {
		return photoUpload;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	//business library
	public void StudentPage(String IndxNumber,String fullName)
	{
		indexnumberTxt.sendKeys(IndxNumber);
	}
	public void fullNameText(String fullName)
	{
		fullnameText.sendKeys(fullName);
	}
	public void namewithInitialTxt(String intwithName)
	{
		namewithinitialTxt.sendKeys(intwithName);
	}
	public void addressTxt(String address)
	{
		addressTxt.sendKeys(address);
	}
	public void genderSelect(WebDriverUtility driverUtility,int index)
	{
		driverUtility.select(genderSelect,index);
	}
	public void phoneNoTxt(String number)
	{
	phoneTxt.sendKeys(number);
	}
	public void emailTxt(String email)
	{
		emailTxt.sendKeys(email);
	}
	public void uploadPhoto(String file)
	{
		
		photoUpload.sendKeys(file);
		
	}
	public void  submitBtn()
	{
		 submitBtn.click();
	}
	//done

}
