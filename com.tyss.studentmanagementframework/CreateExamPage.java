package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateExamPage 
{
	//initialization

		public CreateExamPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//declaration
		
		@FindBy(xpath ="//a[@href=\"#modalInsertform\"]")
		private WebElement addexam;

		@FindBy(xpath ="//input[@id=\"name\"]")
		private WebElement examnametextfield;

		@FindBy(xpath ="//button[@id=\"btnSubmit\"]")
		private WebElement submitbutton;

		public WebElement getAddexam() {
			return addexam;
		}

		public WebElement getExamnametextfield() {
			return examnametextfield;
		}

		public WebElement getSubmitbutton() {
			return submitbutton;
		}
		
		//utilization
		
		public void createnewexam(String examname) throws InterruptedException
		{
			addexam.click();
			examnametextfield.sendKeys(examname);
			submitbutton.click();
			Thread.sleep(5000);
			
		}


}
