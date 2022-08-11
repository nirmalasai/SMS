package com.tyss.studentmanagement;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.tyss.Pages.AllTeachers;
import com.tyss.Pages.HomePage;
import com.tyss.Utilities.BaseClass;

public class AllTeachersTest extends BaseClass {
	@Test
	public void searchEdit()throws EncryptedDocumentException, IOException, InterruptedException{
		
		HomePage homepage=new HomePage(driver);
		homepage.getTeacherLink().click();
		homepage.getAddAllTeacherLnk().click();
		
		AllTeachers allteachers=new AllTeachers(driver);
		
		String search=eLib.getDataFromExcel("AllTeachers", 1, 1);
		allteachers.getSearchEdt().sendKeys(search);
		
		allteachers.getEditBtn().click();
		
		String editName=eLib.getDataFromExcel("AllTeachers", 1, 2);
		allteachers.editFullName(editName);
		

		String editnameintial=eLib.getDataFromExcel("AllTeachers", 1, 3);
		allteachers.editFullName(editnameintial);
		
		
		allteachers.getSubmitEdt().click();
		
		wLib.waitTillElementToClick(driver, homepage.getMyProfileLink());

		
	

}
}