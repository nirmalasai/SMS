package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminSubjectRouting {
	
	
	
	//Intialization
	public AdminSubjectRouting(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//@FindBy (xpath="//span[contains(text(),'Subject Routing')]") private WebElement SubjectRoutingLnk;
	
	//Declaration
	
	@FindBy(xpath="//a[@class='btn btn-success btn-sm pull-right']")private WebElement addBtn;
	
	@FindBy(xpath="//input[@type='search']") private WebElement searchEdt;
	
	@FindBy(name="example1_length")private WebElement showEntriesEdt;
	
	@FindBy(xpath="//a[@onclick='editSubjectFee(this)']")private WebElement editBtn;
	
	@FindBy(xpath="//td[@id='td4_1']/input")private WebElement editFeeBtn;
	
	@FindBy(xpath="//a[@onclick='updateSubjectFee(this)']")private WebElement feeSaveChkbox;
	
	

}
