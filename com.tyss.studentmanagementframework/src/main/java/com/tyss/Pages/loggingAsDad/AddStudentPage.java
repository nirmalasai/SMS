package com.tyss.Pages.loggingAsDad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.Utilities.WebDriverUtility;

public class AddStudentPage extends WebDriverUtility {
	
	//initialization
	public AddStudentPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//declaration for student 
	@FindBy(id="index_number")private WebElement indexEdt;
	
	@FindBy(id="full_name")private WebElement fullNameEdt;
	
	@FindBy(id="i_name")private WebElement nameWithInitialEdt;
	
	@FindBy(id="address")private WebElement addressEdt;
	
	@FindBy(id="email")private WebElement emailIdEdt;
	
	@FindBy(name="phone")private WebElement phnoEdt;
	
	@FindBy(name="b_date")private WebElement birthDayEdt;
	
	@FindBy(name="gender")private WebElement genderDropDwn;
	
	@FindBy(id="fileToUpload")private WebElement fileToUploadEdt;
	
	
	//declaration for guardian 
	@FindBy(name="g_full_name")private WebElement guardianEdt;

	@FindBy(id="g_full_name")private WebElement gaurdianFullNameEdt;
	
	@FindBy(id="g_i_name")private WebElement gaurdianNameWithInitialEdt;
	
	@FindBy(id="g_address")private WebElement gaurdianAddressEdt;
	
	@FindBy(id="g_email")private WebElement gaurdianEmailEdt;
	
	@FindBy(id="g_phone")private WebElement gaurdianPhoneEdt;
	
	@FindBy(id="g_b_date")private WebElement gaurdianDateOfBirthEdt;
	
	@FindBy(name="g_gender")private WebElement gaurdianSelectDropDownEdt;
	
	@FindBy(id="g_fileToUpload")private WebElement gaurdianFileUploadEdt;
	
	@FindBy(id="btnSubmit")private WebElement nextButton;
	
	@FindBy(id="grade")private WebElement gradeDropDown;
	
	@FindBy(id="btnSubmit1")private WebElement submitButtonEdt;
	
	
	//utilization
	public WebElement getIndexEdt() {
		return indexEdt;
	}


	public WebElement getFullNameEdt() {
		return fullNameEdt;
	}


	public WebElement getNameWithInitialEdt() {
		return nameWithInitialEdt;
	}


	public WebElement getAddressEdt() {
		return addressEdt;
	}


	public WebElement getEmailIdEdt() {
		return emailIdEdt;
	}


	public WebElement getPhnoEdt() {
		return phnoEdt;
	}


	public WebElement getBirthDayEdt() {
		return birthDayEdt;
	}


	public WebElement getGenderDropDwn() {
		return genderDropDwn;
	}


	public WebElement getFileToUploadEdt() {
		return fileToUploadEdt;
	}


	public WebElement getGuardianEdt() {
		return guardianEdt;
	}


	public WebElement getGaurdianFullNameEdt() {
		return gaurdianFullNameEdt;
	}


	public WebElement getGaurdianNameWithInitialEdt() {
		return gaurdianNameWithInitialEdt;
	}


	public WebElement getGaurdianAddressEdt() {
		return gaurdianAddressEdt;
	}


	public WebElement getGaurdianEmailEdt() {
		return gaurdianEmailEdt;
	}


	public WebElement getGaurdianPhoneEdt() {
		return gaurdianPhoneEdt;
	}


	public WebElement getGaurdianDateOfBirthEdt() {
		return gaurdianDateOfBirthEdt;
	}


	public WebElement getGaurdianSelectDropDownEdt() {
		return gaurdianSelectDropDownEdt;
	}


	public WebElement getGaurdianFileUploadEdt() {
		return gaurdianFileUploadEdt;
	}


	public WebElement getNextButton() {
		return nextButton;
	}
	
	public WebElement getGradeDropDown() {
		return gradeDropDown;
	}
	
	public WebElement getSubmitButtonEdt() {
		return submitButtonEdt;
	}

	public void addStudent(String indexNumber, String fullName, String nameInitials, String address, String email, 
			String phoneNumber, String dateOfBirth, String VisibleText, String photoPath)
	{
        //student
		indexEdt.sendKeys(indexNumber);
		fullNameEdt.sendKeys(fullName);
		nameWithInitialEdt.sendKeys(nameInitials);
		addressEdt.sendKeys(address);
		emailIdEdt.sendKeys(email);
		phnoEdt.sendKeys(phoneNumber);
		birthDayEdt.sendKeys(dateOfBirth);
		select(VisibleText, genderDropDwn);
fileToUploadEdt.sendKeys(photoPath);
		
	}
	
	public void addGuardian(String fullName, String nameInitials, String address, String email, String phoneNumber, String dateOfBirth, String VisibleText, String photoPath )
	{
		//guardian
		//guardianEdt.sendKeys(indexNumber, String fullName, String nameI);
		gaurdianFullNameEdt.sendKeys(fullName);
		gaurdianNameWithInitialEdt.sendKeys(nameInitials);
		gaurdianAddressEdt.sendKeys(address);
		gaurdianEmailEdt.sendKeys(email);
		gaurdianPhoneEdt.sendKeys(phoneNumber);
		gaurdianDateOfBirthEdt.sendKeys(dateOfBirth);
		select(VisibleText, gaurdianSelectDropDownEdt);
		gaurdianFileUploadEdt.sendKeys(photoPath);
		nextButton.click();
	}
	
	public void selectGradeFromDropDown(String VisibleText)
	{
	   select(VisibleText, gradeDropDown);
	}


	public void closeAddStudentSubject(AddStudentPage addStudent) {
		
		
	}
}