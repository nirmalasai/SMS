package com.tyss.Pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import com.tyss.Utilities.BaseClass;

public class AllStudentPage extends BaseClass
{
	//declaration
	@FindBy(xpath="//input[@type='search']")private WebElement searchTextBox;
	@FindBy(name="grade")private WebElement gradeDropDown;
	@FindBy(xpath ="//button[@id=\"btnPaid\"]")private WebElement paidbutton;
	@FindBy(xpath ="//cr-button[@role=\"button\"]")private WebElement print;
	@FindBy(xpath ="//button[@id=\"btnSubmit\"]")private WebElement finalpaymentsubmitbutton;

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

	public WebElement getFinalpaymentsubmitbutton() {
		return finalpaymentsubmitbutton;
	}
	public WebElement getPrint() {
		return print;
	}
	public WebElement getPaidbutton() {
		return paidbutton;

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

	
	
	


	public void allstudentdropdown()
	{
		wLib.select(gradeDropDown, 2);
		submitbtn.click();
	}
	public void addpayment() throws InterruptedException, AWTException
	{
		//wLib.javascript(driver, addPayment);
		addPayment.click();
		//wLib.javascript(driver, paidbutton);
		//wLib.switchToFrame(driver, paidbutton);
		
		wLib.waitAndClick(paidbutton, 3, 1);
		//Thread.sleep(1000);
		paidbutton.click();
		//wLib.waitAndClick(finalpaymentsubmitbutton, 2, 10);
		//finalpaymentsubmitbutton.click();
		//wLib.switchToFrame(driver, finalpaymentsubmitbutton);
	    wLib.robottabenter();
	    //Thread.sleep(3000);
	    //wLib.robotenter();
	    
	    
		
	}


}
