package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.Utilities.WebDriverUtility;

public class ParentMySonExamMark extends WebDriverUtility
{
	
	//initialization

		public ParentMySonExamMark(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	//declaration
		@FindBy(xpath ="//select[@id=\"exam\"]")
		private WebElement examdropdown;

		@FindBy(xpath ="//button[@id=\"btnSubmit\"]")
		private WebElement submitbutton;
		
		//utilization

		public WebElement getExamdropdown() {
			return examdropdown;
		}

		public WebElement getSubmitbutton() {
			return submitbutton;
		}
		
		public void selectexam()
		{
			select(examdropdown, 1);
			submitbutton.click();
		}
		
		
		
		
}
