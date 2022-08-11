package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.Utilities.WebDriverUtility;

public class AllStudentPage extends WebDriverUtility{
	//declaration
	@FindBy(xpath="//input[@type='search']")private WebElement searchTextBox;
	@FindBy(name="grade")private WebElement gradeDropDown;
	@FindBy(xpath="//select[@id='grade']//option[@value='11']")private WebElement selectGrade1;
	@FindBy(xpath="//button[.='Submit']")private WebElement submitbtn;
	@FindBy(xpath="//td[.='1']/..//a[.='Edit']")private WebElement editbtn;
	@FindBy(xpath="//td[.='1']/..//a[.='Leave']")private WebElement leavebtn;
	@FindBy(id="btnYes")private WebElement yesacceptBtn;
	@FindBy(xpath="(//strong[@style='color:red;'])[3]")private WebElement conformationMsg;
	@FindBy(xpath="//td[.='1']/..//a[.='Edit Subject']")private WebElement editSubjecct;
	@FindBy(xpath="//td[.='1']/..//a[.='Upgrade Grade']")private WebElement upgradeGrade;
	@FindBy(xpath="//td[.='1']/..//a[.='Add Payment']")private WebElement addPayment;
	@FindBy(xpath="//td[.='1']/..//a[.='View Payments']")private WebElement viewPayment;
	//initialization 
	public AllStudentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getGradeDropDown() {
		return gradeDropDown;
	}
	public WebElement getConformationMsg() {
		return conformationMsg;
	}
	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	public WebElement getSelectGrade1() {
		return selectGrade1;
	}
	public WebElement getYesacceptBtn() {
		return yesacceptBtn;
	}
	public WebElement getSearchTextBox() {
		return searchTextBox;
	}
	public WebElement getEditbtn() {
		return editbtn;
	}
	public WebElement getLeavebtn() {
		return leavebtn;
	}
	public WebElement getEditSubjecct() {
		return editSubjecct;
	}
	public WebElement getUpgradeGrade() {
		return upgradeGrade;
	}
	public WebElement getAddPayment() {
		return addPayment;
	}
	public WebElement getViewPayment() {
		return viewPayment;
	}
	
	
	
}
