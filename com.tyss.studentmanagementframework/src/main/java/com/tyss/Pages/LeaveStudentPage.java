package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveStudentPage {
	//Declaration
	@FindBy(xpath="//input[@type='search']")private WebElement searchTextBox;
	@FindBy(xpath="//td[.='1']/..//a[.='Active']")private WebElement activeBtn;
	@FindBy(xpath="//td[.='1']/..//a[.='View']")private WebElement viewBtn;
	//Initilization
	public LeaveStudentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getSearchTextBox() {
		return searchTextBox;
	}
	public WebElement getActiveBtn() {
		return activeBtn;
	}
	public WebElement getViewBtn() {
		return viewBtn;
	}
	

}
