package com.tyss.Pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.Utilities.BaseClass;
import com.tyss.Utilities.WebDriverUtility;//done

public class SubjectPage extends BaseClass
{
	//initialization 
	public SubjectPage(SearchContext driver)
	{
		PageFactory.initElements(driver,this);
	}
	//declaration
	@FindBy(id = "name")
	private WebElement subjectnameTxt;
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submitBtn;
	@FindBy(xpath = "//select[@name='example1_length']")
	private WebElement showEntriesDropdown;
	@FindBy (xpath = "search")
	private WebElement searchTxt;
	@FindBy(xpath = "//td[@id='td1_26']/following-sibling::td/child::a[@onclick='showModal(this)']")
	private WebElement editBtn;
	@FindBy(xpath = "//input[@id='name1']")
	private WebElement editSubjecttxt;
	@FindBy(xpath = "//button[@id='btnSubmit1']")
	private WebElement updateBtn;

	@FindBy(xpath ="//span[.=\"Subject Routing\"]")
	private WebElement SubjectRouting;

	//business Libraries
	public  void subjectName(String subjectname)
	{
		subjectnameTxt.sendKeys(subjectname);
	}
	public WebElement getSubjectnameTxt() {
		return subjectnameTxt;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public WebElement getShowEntriesDropdown() {
		return showEntriesDropdown;
	}
	public WebElement getSearchTxt() {
		return searchTxt;
	}
	public WebElement getEditBtn() {
		return editBtn;
	}
	public WebElement getEditSubjecttxt() {
		return editSubjecttxt;
	}
	public WebElement getUpdateBtn() {
		return updateBtn;
	}
	public WebElement getSubjectRouting() {
		return SubjectRouting;
	}
	public void submit()
	{
		submitBtn.click();
	}
	public void dropdown(WebDriverUtility driverUtility, int index)
	{
		driverUtility.select(showEntriesDropdown, index);
	}
	public void search(String name)
	{
		searchTxt.sendKeys(name);
	}
	public void editBtn()
	{
		editBtn.click();
	}
	public void edtSubject(String editsubject)
	{
		editSubjecttxt.sendKeys(editsubject);
		updateBtn.click();

	}

	public void entersubjectname(String subjectname) throws InterruptedException
	{
		subjectnameTxt.sendKeys(subjectname);
		submitBtn.click();
		Thread.sleep(5000);

	}


}
