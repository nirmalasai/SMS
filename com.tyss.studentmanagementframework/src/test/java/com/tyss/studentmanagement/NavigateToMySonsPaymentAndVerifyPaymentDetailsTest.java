package com.tyss.studentmanagement;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.tyss.Pages.AdminHomePage;
import com.tyss.Pages.AllStudentPage;
import com.tyss.Pages.ParentHomePage;
import com.tyss.Pages.ParentLoginPage;
import com.tyss.Utilities.BaseClass;
@Listeners(com.tyss.Utilities.Listeners.class)
public class NavigateToMySonsPaymentAndVerifyPaymentDetailsTest extends BaseClass
{
	/**
	 * 
	 * @throws EncryptedDocumentException
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	@Test
	public void navigateToMySonsPaymentAndVerifyPaymentDetailsTest() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException, AWTException
	{
		

		//get the random number
		//int randNum = jLib.getRandomNum();


		//fetch data from the excel library
		String text=eLib.getDataFromExcel("Classroom", 1, 4);

		//get the data from the properties file
		String PARENTUSERNAME=fLib.getPropertKeyValue("username2");
		String PARENTPASSWORD=fLib.getPropertKeyValue("password2");


		//click on the add student module
		AdminHomePage home = new AdminHomePage(driver);
		home.getStudent().click();
		home.getAllStudent().click();
		AllStudentPage allstudent = new AllStudentPage(driver);
		allstudent.allstudentdropdown();
		allstudent.addpayment();
		home.SignoutFromAdminApp();

		//login as parent
		ParentLoginPage parentlogin = new ParentLoginPage(driver);
		parentlogin.LogInToParent(PARENTUSERNAME, PARENTPASSWORD);

		//navigate to my sons payment
		ParentHomePage parent = new ParentHomePage(driver);
		parent.getMySonsPayments().click();
		parent.SignoutFromParentApp();

		//logout as parent
		parent.SignoutFromParentApp();

	}
}
