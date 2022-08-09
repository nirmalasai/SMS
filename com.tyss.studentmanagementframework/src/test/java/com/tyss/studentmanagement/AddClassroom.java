package com.tyss.studentmanagement;

import java.io.FileNotFoundException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.tyss.Pages.AdminHomePage;
import com.tyss.Utilities.BaseClass;


public class AddClassroom extends BaseClass{
	@Test
	public void classroom()throws EncryptedDocumentException, FileNotFoundException {
		
		AdminHomePage adminhomepage=new AdminHomePage(driver);
		adminhomepage.getClassroom().click();
		
		
		
		
	}
	
	
}
