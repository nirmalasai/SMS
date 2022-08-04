package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherLoginPage 
{
	//initialization

		public TeacherLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//declaration

		@FindBy(name ="email")
		private WebElement Email;

		@FindBy(name ="password")
		private WebElement Password;
		
		@FindBy(xpath ="//a[.=\"Submit\"]")
		private WebElement SubmitButton;

		//utilization

		public WebElement getEmail() {
			return Email;
		}

		public WebElement getSubmitButton() {
			return SubmitButton;
		}

		public WebElement getPassword() {
			return Password;
		}
		
		public void LogInToTeacher(String AdminEmail,String AdminPassword)
		{
			Email.sendKeys(AdminEmail);
			Password.sendKeys(AdminPassword);
			SubmitButton.click();
		}
}
