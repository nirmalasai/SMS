package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.Utilities.WebDriverUtility;

public class LeaveStudentPage extends WebDriverUtility {
	//Declaration
	@FindBy(xpath="//input[@type='search']")private WebElement searchTextBox;
	@FindBy(xpath="//td[.='1']/..//a[.='Active']")private WebElement activeBtn;
	@FindBy(id="btnYes")private WebElement yesbtnEdt;
	@FindBy(id="grade")private WebElement selectgradedropdown;
	@FindBy(xpath="//option[.='Grade 1']")private WebElement selectgradeone;
	@FindBy(id="checkbox")private WebElement selectcheckBox;
	@FindBy(xpath="//td[.='1']/..//a[.='View']")private WebElement viewBtn;
	//Initilization
	public LeaveStudentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getSearchTextBox() {
		return searchTextBox;
	}
	public WebElement getSelectcheckBox() {
		return selectcheckBox;
	}
	public WebElement getSelectgradedropdown() {
		return selectgradedropdown;
	}
	public WebElement getSelectgradeone() {
		return selectgradeone;
	}
	public WebElement getActiveBtn() {
		return activeBtn;
	}
	public WebElement getYesbtnEdt() {
		return yesbtnEdt;
	}
	public WebElement getViewBtn() {
		return viewBtn;
	}
	public void selectByindex() {
		select(selectgradeone, 1);
	}
	
	

}
