package com.tyss.Pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.Utilities.WebDriverUtility;

public class SubjectRoutingPage {

	public SubjectRoutingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[@class='btn btn-success btn-sm pull-right']")
	private WebElement addBtn;
	
	@FindBy(xpath = "//select[@id='grade']")
	private WebElement selectGrade;
	
	@FindBy(xpath = "//select[@id='subject']")
	private WebElement selectSubject;
	
	@FindBy(xpath = "//select[@id='teacher']")
	private WebElement selectTeacher;
	
	@FindBy(xpath = "//input[@id='fee']")
	private WebElement feeText;
	
	@FindBy(xpath = "//button[@id='btnSubmit']")
	private WebElement submitBtn;
	
	@FindBy(id = "edit_sfee_8")
	private WebElement editBtn;
	
	@FindBy(xpath = "//select[@id='grade1']")
	private WebElement editGrade;
	
	@FindBy(xpath = "//button[@id='btnSubmit1']")
	private WebElement updateBtn;
	
	public WebElement getAddBtn() {
		return addBtn;
	}
	public WebElement getSelectGrade() {
		return selectGrade;
	}
	public WebElement getSelectSubject() {
		return selectSubject;
	}
	public WebElement getSelectTeacher() {
		return selectTeacher;
	}
	public WebElement getFeeText() {
		return feeText;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public void grade(WebDriverUtility driverUtility,int index)
	{
		driverUtility.select(selectGrade, index);
	}
	public void subject(WebDriverUtility driverUtility,int index)
	{
		driverUtility.select(selectSubject, index);
	}
	public void teacher(WebDriverUtility driverUtility,int index)
	{
		driverUtility.select(selectTeacher, index);
	}
	public void fee(String fee)
	{
		feeText.sendKeys(fee);
	}
	public void submit()
	{
		submitBtn.click();
	}
	public void edit()
	{
		editBtn.click();
	}
	public void editGrade(WebDriverUtility driverUtility,int index)
	{
		driverUtility.select(editGrade, index);
	}
	public void update()
	{
		updateBtn.click();
	}
	//doneee
}
