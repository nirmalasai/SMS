package com.tyss.studentmanagement;

import org.testng.annotations.Test;

import com.tyss.Pages.AdminHomePage;
import com.tyss.Pages.LeaveStudentPage;
import com.tyss.Utilities.BaseClass;

public class LeaveStudent extends BaseClass{
	@Test
	public void activeStudent() throws InterruptedException {
		//access the admin home page
		AdminHomePage adminhome = new AdminHomePage(driver);
		//click on the student
		adminhome.getStudent().click();
		//click on the student leave
		adminhome.getLeaveStudent().click();
		//create the object of leave student page
		LeaveStudentPage leavestd = new LeaveStudentPage(driver);
		//click on active button
		leavestd.getActiveBtn().click();
		//click on the accept btn.
		leavestd.getYesbtnEdt().click();
		//select the grade 
		Thread.sleep(3000);
		leavestd.getSelectgradedropdown().click();
		Thread.sleep(5000);
		//select the grade
		 leavestd.getSelectgradeone();
		
		//
		Thread.sleep(6000);
		
	}

}
