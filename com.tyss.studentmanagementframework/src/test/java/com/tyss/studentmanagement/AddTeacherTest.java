package com.tyss.studentmanagement;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tyss.Pages.HomePage;
import com.tyss.Pages.TeacherPage;
import com.tyss.Utilities.BaseClass;
public class AddTeacherTest extends BaseClass{
@Test
public void addTeacherpage()throws EncryptedDocumentException, IOException, InterruptedException{

	//To click on Teacherlink
	HomePage homepage=new HomePage(driver);
	homepage.getTeacherLink().click();
	
	TeacherPage addTeacher=new TeacherPage(driver);
	//to click on addteacher
	homepage.getAddTeacherLink().click();
	String actualname=addTeacher.getTeacherPageTitle().getText();
	Assert.assertTrue(actualname.contains("Teacher"),"Page not navigated");
	Reporter.log("add teacher page display",true);
	
	
	
	String indexno=jLib.getRandomNum()+eLib.getDataFromExcel("AddTeacher", 1, 1);
	addTeacher.getIndexnumberTxt().sendKeys(indexno);
	
	String name=eLib.getDataFromExcel("AddTeacher", 1, 2);
	addTeacher.getFullnameText().sendKeys(name);
	
	String nameintial=eLib.getDataFromExcel("AddTeacher", 1, 3);
	addTeacher.getNamewithinitialTxt().sendKeys(nameintial);
	
	String address=eLib.getDataFromExcel("AddTeacher", 1, 4);
	addTeacher.getAddressTxt().sendKeys(address);
	
	addTeacher.genderSelect(wLib, 1);
	
	String phno=eLib.getDataFromExcel("AddTeacher",1, 6);
	addTeacher.getPhoneTxt().sendKeys(phno);
	
	
	
	String email=jLib.getRandomNum()+eLib.getDataFromExcel("AddTeacher", 1, 7);
	addTeacher.getEmailTxt().sendKeys(email);
	
	String photo=eLib.getDataFromExcel("AddTeacher", 1, 8);
	addTeacher.uploadPhoto(photo);
	
	addTeacher.submitBtn();
	Thread.sleep(5000);
	
	

}
}
