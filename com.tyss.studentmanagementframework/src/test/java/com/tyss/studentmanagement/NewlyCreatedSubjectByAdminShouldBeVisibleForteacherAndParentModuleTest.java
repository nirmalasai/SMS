package com.tyss.studentmanagement;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.tyss.Pages.AdminHomePage;
import com.tyss.Pages.AllStudentPage;
import com.tyss.Pages.ParentHomePage;
import com.tyss.Pages.ParentLoginPage;
import com.tyss.Pages.SubjectPage;
import com.tyss.Pages.SubjectRoutingPage;
import com.tyss.Pages.TeacherHomePage;
import com.tyss.Pages.TeacherLoginPage;
import com.tyss.Utilities.BaseClass;

public class NewlyCreatedSubjectByAdminShouldBeVisibleForteacherAndParentModuleTest extends BaseClass
{
	/**
	 * 
	 * @throws EncryptedDocumentException
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@Test
	public void AddStudentsDetailsGotoAllStudentsAndVerifyStudentsDetails() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException
	{
		//get the random number
		//int randNum = jLib.getRandomNum();

		//fetch data from the excel library
		String text=eLib.getDataFromExcel("Classroom", 1, 4);
		String TEACHERUSERNAME=fLib.getPropertKeyValue("username1");
		String TEACHERPASSWORD=fLib.getPropertKeyValue("password1");

		String PARENTUSERNAME=fLib.getPropertKeyValue("username2");
		String PARENTPASSWORD=fLib.getPropertKeyValue("password2");


		//click on the add subject module
		AdminHomePage home = new AdminHomePage(driver);
		home.getSubject().click();

		//enter the subject name
		SubjectPage subject = new SubjectPage(driver);
		subject.entersubjectname(text);

		//click on the subject routing link
		home.getSubjectRouting().click();

		//click on the add button
		SubjectRoutingPage subjectrouting = new SubjectRoutingPage(driver);
		subjectrouting.getAddBtn().click();

		//enter all the details
		subjectrouting.grade(wLib, 1);
		subjectrouting.subject(wLib, 2);
		subjectrouting.teacher(wLib, 1);
		subjectrouting.fee(text);
		subjectrouting.submit();

		//sign out from admin account
		home.SignoutFromAdminApp();

		//login as teacher
		TeacherLoginPage teacherlogin = new TeacherLoginPage(driver);
		teacherlogin.LogInToTeacher(TEACHERUSERNAME, TEACHERPASSWORD);

		//click on the all subject link
		TeacherHomePage teacherhome = new TeacherHomePage(driver);
		teacherhome.clickonallsubject();

		//sign out from teacher account
		teacherhome.SignoutFromTeacherApp();

		//log in as parent
		ParentLoginPage parentlogin = new ParentLoginPage(driver);
		parentlogin.LogInToParent(PARENTUSERNAME, PARENTPASSWORD);

		//click on all subject link
		ParentHomePage parenthome = new ParentHomePage(driver);
		parenthome.clickonallsubject();

		//click on the logout button
		parenthome.SignoutFromParentApp();

	}
}
