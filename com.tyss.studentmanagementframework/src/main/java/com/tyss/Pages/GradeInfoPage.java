package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.Utilities.WebDriverUtility;

public class GradeInfoPage extends WebDriverUtility {
	//Declaration
	@FindBy(xpath="//input[@type='search']")private WebElement searchBox;
	@FindBy(xpath="//td[.='Grade 1']/..//a[.='Edit']")private WebElement editLink;
	@FindBy(xpath="//td[.='Grade 1']/..//a[.='View eMark']")private WebElement viewEmark;
	@FindBy(id="name1")private WebElement editGrade;
	@FindBy(id="admission_fee1")private WebElement editAdmissiomFee;
	@FindBy(name="hall_charge")private WebElement editHallCharge;
	@FindBy(id="btnSubmit1")private WebElement submitUpgrade;
	//initialization 
	public GradeInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getEditLink() {
		return editLink;
	}
	public WebElement getViewEmark() {
		return viewEmark;
	}
	public WebElement getEditGrade() {
		return editGrade;
	}
	public WebElement getEditAdmissiomFee() {
		return editAdmissiomFee;
	}
	public WebElement getEditHallCharge() {
		return editHallCharge;
	}
	public WebElement getSubmitUpgrade() {
		return submitUpgrade;
	}
	
}
