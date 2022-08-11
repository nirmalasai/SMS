package com.tyss.studentmanagement;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;


import com.tyss.Pages.AdminHomePage;
import com.tyss.Pages.loggingAsDad.AddStudentPage;
import com.tyss.Utilities.BaseClass;
import com.tyss.Utilities.WebDriverUtility;

public class AddStudentAndVerifyInAllStudentTest extends BaseClass {

	@Test
	public void addStudentAndVerifyStudentDetails() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		//click on add student
		AdminHomePage adminHomePage = new AdminHomePage(driver);
		adminHomePage.getStudent().click();
		adminHomePage.getAddStudent().click();


		//entering the credentials of a student
		//		String indexNumber= null;
		//		String fullName =null;
		//		String nameInitials = null;
		//		String address =null;
		//		String email = null;
		//		String phoneNumber = null;
		//		String dateOfBirth =null;
		//		String VisibleText = null;
		//		String photoPath = null;

		//adding student credentials
		String indexNumber = eLib.getDataFromExcel("Sheet1", 1, 0)+jLib.getRandomNum();
		String fullName = eLib.getDataFromExcel("Sheet1", 1, 1)+jLib.getRandomNum();
		String nameInitials = eLib.getDataFromExcel("Sheet1", 1, 2)+jLib.getRandomNum();
		String address = eLib.getDataFromExcel("Sheet1", 1, 3)+jLib.getRandomNum();
		String email = jLib.getRandomNum()+eLib.getDataFromExcel("Sheet1", 1, 4);
		String phoneNumber = eLib.getDataFromExcel("Sheet1", 1, 5);
		String dateOfBirth = eLib.getDataFromExcel("Sheet1", 1, 6);
		String VisibleText = eLib.getDataFromExcel("Sheet1", 1, 7);
		String photoPath = eLib.getDataFromExcel("Sheet1", 1, 8);

		AddStudentPage addStudent = new AddStudentPage(driver);
		addStudent.addStudent(indexNumber, fullName, nameInitials, address, email, phoneNumber, dateOfBirth, VisibleText, photoPath);

		//entering guardian credentials
		String guardianFullName = eLib.getDataFromExcel("Sheet1", 2, 1)+jLib.getRandomNum();
		String guardianNameInitials = eLib.getDataFromExcel("Sheet1", 2, 2)+jLib.getRandomNum();
		String guardianAddress = eLib.getDataFromExcel("Sheet1", 2, 3)+jLib.getRandomNum();
		String guardinaEmail = jLib.getRandomNum()+eLib.getDataFromExcel("Sheet1", 2, 4);
		String guardianPhoneNumber = eLib.getDataFromExcel("Sheet1", 2, 5);
		String guardianDateOfBirth = eLib.getDataFromExcel("Sheet1", 2, 6);
		String guardianVisibleText = eLib.getDataFromExcel("Sheet1", 2, 7);
		String guardianPhotopath = eLib.getDataFromExcel("Sheet1", 2, 8);

		Reporter.log("Details are entered", true);
		addStudent.addGuardian(guardianFullName, guardianNameInitials, guardianAddress, guardinaEmail, guardianPhoneNumber, guardianDateOfBirth, guardianVisibleText, guardianPhotopath);

	   addStudent.getNextButton().click();
	   wLib.waitTillElementToVisible(driver, addStudent.getGradeDropDown());
	   addStudent.selectGradeFromDropDown("Grade 1");
	   addStudent.getSubmitButtonEdt().click();
	   Reporter.log("Grade selected", true);
	   
//	   //Closing add student subject
//	   addStudent.closeAddStudentSubject(addStudent);
//	   Reporter.log("student subject got closed successfully", true);

	}
}