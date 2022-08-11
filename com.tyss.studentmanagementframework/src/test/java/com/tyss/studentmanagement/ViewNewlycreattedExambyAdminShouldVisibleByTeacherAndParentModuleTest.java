package com.tyss.studentmanagement;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.tyss.Pages.AdminHomePage;
import com.tyss.Pages.CreateExamPage;
import com.tyss.Pages.ParentHomePage;
import com.tyss.Pages.ParentLoginPage;
import com.tyss.Pages.ParentMySonExamMark;
import com.tyss.Pages.TeacherHomePage;
import com.tyss.Pages.TeacherLoginPage;
import com.tyss.Pages.TeacherMyStudentExamMarksPage;
import com.tyss.Utilities.BaseClass;

public class ViewNewlycreattedExambyAdminShouldVisibleByTeacherAndParentModuleTest extends BaseClass

{
	/**
	 * 
	 * @throws EncryptedDocumentException
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@Test
	public void viewNewlycreattedExambyAdminShouldVisibleByTeacherAndParentModuleTest() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException
	{
		//get the random number
		//int randNum = jLib.getRandomNum();

		//fetch data from the excel library
		String TEACHERUSERNAME=fLib.getPropertKeyValue("username1");
		String TEACHERPASSWORD=fLib.getPropertKeyValue("password1");

		String PARENTUSERNAME=fLib.getPropertKeyValue("username2");
		String PARENTPASSWORD=fLib.getPropertKeyValue("password2");

		String text=eLib.getDataFromExcel("Classroom", 1, 4);


		//click on the add exam
		AdminHomePage home = new AdminHomePage(driver);
		home.clickoncreateexam();


		//create new exam
		CreateExamPage newexam = new CreateExamPage(driver);
		newexam.createnewexam(text);

		//logout as administrator
		home.SignoutFromAdminApp();

		//login as teacher
		TeacherLoginPage teacherlogin = new TeacherLoginPage(driver);
		teacherlogin.LogInToTeacher(TEACHERUSERNAME, TEACHERPASSWORD);

		//click on the my student exam marks
		TeacherHomePage teacherhome = new TeacherHomePage(driver);
		teacherhome.clickonmystudentexam();

		//check my student exam marks
		TeacherMyStudentExamMarksPage studentmark = new TeacherMyStudentExamMarksPage(driver);
		studentmark.mystudentexammarks();

		//logout as teacher
		teacherhome.SignoutFromTeacherApp();

		//login as parent
		ParentLoginPage parentlogin = new ParentLoginPage(driver);
		parentlogin.LogInToParent(PARENTUSERNAME, PARENTPASSWORD);

		//click on the my sons exam marks
		ParentHomePage parenthome = new ParentHomePage(driver);
		parenthome.mysonsmark();

		//select the exam from drop down
		ParentMySonExamMark myson = new ParentMySonExamMark(driver);
		myson.selectexam();

		//log out as parent
		parenthome.SignoutFromParentApp();

	}

}
