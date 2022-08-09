package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllStudent {
	//intialization
	public AllStudent(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//
	
	@FindBy(name="grade")private WebElement gradedropdwn;

	@FindBy(xpath="//button[text()='Submit']")private WebElement submitBtn;
	
	public WebElement getGradedropdwn() {
		return gradedropdwn;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	
	
}
