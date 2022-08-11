package com.tyss.studentmanagement;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.tyss.Pages.AdminHomePage;
import com.tyss.Pages.AllStudentPage;
import com.tyss.Utilities.BaseClass;
import com.tyss.Utilities.WebDriverUtility;


public class AllStudent extends BaseClass {
	@Test
	public void leaveStudent() throws InterruptedException {
		AdminHomePage adminhomepage = new AdminHomePage(driver);
		adminhomepage.getStudent().click();
		adminhomepage.getAllStudent().click();
		AllStudentPage allstudentpage = new AllStudentPage(driver);
		allstudentpage.getGradeDropDown().click();
		//allstudentpage.getSelectGrade1().click();
		allstudentpage.getSubmitbtn().click();
		allstudentpage.getLeavebtn().click();
		//Thread.sleep(5000);
		allstudentpage.getYesacceptBtn().click();
		WebDriverUtility web = new WebDriverUtility();
		System.out.println(allstudentpage.getConformationMsg().getText());
		Thread.sleep(6000);
		
		

	}

}
