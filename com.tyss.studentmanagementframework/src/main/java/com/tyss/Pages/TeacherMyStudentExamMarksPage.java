package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.Utilities.WebDriverUtility;

public class TeacherMyStudentExamMarksPage extends WebDriverUtility
{
	//initialization

		public TeacherMyStudentExamMarksPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		//declaration

		@FindBy(xpath ="//select[@id=\"grade\"]")
		private WebElement gradedropdown;
		
		@FindBy(xpath ="//select[@id=\"exam\"]")
		private WebElement examdropdown;
		
		@FindBy(xpath ="//button[@id=\"btnSubmit\"]")
		private WebElement submitbutton;

		public WebElement getGradedropdown() {
			return gradedropdown;
		}

		public WebElement getSubmitbutton() {
			return submitbutton;
		}

		public WebElement getExamdropdown() {
			return examdropdown;
		}
		
		//utilization
		
		public void mystudentexammarks()
		{
		select(gradedropdown, 1);
		select(examdropdown, 2);
		submitbutton.click();
		
		}
		
}
