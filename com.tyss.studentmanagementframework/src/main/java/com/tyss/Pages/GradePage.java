package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GradePage {
	// Declaration
	@FindBy(id = "name")
	private WebElement gradeName;
	@FindBy(id = "admission_fee")
	private WebElement admissionFee;
	@FindBy(id = "hall_charge")
	private WebElement hallCharge;
	@FindBy(id = "btnSubmit")
	private WebElement nextBtn;
	@FindBy(id = "mark_range_text_1")
	private WebElement gradeRange;
	@FindBy(id = "mark_grade_text_1")
	private WebElement grade;
	@FindBy(xpath = "//label[.='Range & Grade']/ancestor::div[@class='form-group']/descendant::span[@class='glyphicon glyphicon-remove']")
	private WebElement removeRangeAndGrade;
	@FindBy(xpath = "//label[.='Range & Grade']/ancestor::div[@class='form-group']/descendant::span[@class='glyphicon glyphicon-plus']")
	private WebElement addRangeGrade;
	@FindBy(id = "btnSubmit1")
	private WebElement submitBtn;
	@FindBy(xpath="//input[@type='search']")private WebElement searchBox;
	@FindBy(xpath = "addNewRow(this)")
	private WebElement addeMarkBtn;
	
	@FindBy(id = "//button[@id='btnSubmit1']")
	private WebElement submiteMarkBtn;
	
	@FindBy(xpath = "//input[@name='mark_range[]']")
	private WebElement addRangeText;
	
	@FindBy (id = "mark_grade_text_1")
	private WebElement addGradeTxt;
	

	// initialization
	public GradePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public WebElement getGradeName() {
		return gradeName;
	}

	public WebElement getAdmissionFee() {
		return admissionFee;
	}

	public WebElement getHallCharge() {
		return hallCharge;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}

	public WebElement getGradeRange() {
		return gradeRange;
	}

	public WebElement getGrade() {
		return grade;
	}

	public WebElement getRemoveRangeAndGrade() {
		return removeRangeAndGrade;
	}

	public WebElement getAddRangeGrade() {
		return addRangeGrade;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public void addEmark(String range, String grade)
	{
		//addeMarkBtn.click();
		addRangeText.sendKeys(range);
		addGradeTxt.sendKeys(grade);
		submiteMarkBtn.click();
	}

}
