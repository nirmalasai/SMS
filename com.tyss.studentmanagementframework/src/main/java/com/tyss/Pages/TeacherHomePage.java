package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherHomePage
{
	//initialization

		public TeacherHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}


		//declaration
		
		@FindBy(xpath ="//a[.=\"Dashboard\"]")
		private WebElement dashboard;

		@FindBy(xpath ="//a[.=\"My Profile\"]")
		private WebElement myprofile;
		
		@FindBy(xpath ="//a[@href=\"my_student.php\"]")
		private WebElement MyStudent;
		
		
		
		@FindBy(xpath ="//a[.=\"Subject\"]")
		private WebElement Subject;
		
		@FindBy(xpath ="//a[@href=\"my_subject2.php\"]")
		private WebElement MySubject;
		
		@FindBy(xpath ="//a[@href=\"all_subject2.php\"]")
		private WebElement AllSubject;
		
		
		@FindBy(xpath ="//a[.=\"Timetable\"]")
		private WebElement Timetable;
		
		@FindBy(xpath ="//a[@href=\"my_timetable2.php\"]")
		private WebElement MyTimetable;
		
		@FindBy(xpath ="//a[@href=\"all_timetable2.php\"]")
		private WebElement AllTimetable;
		
		
		@FindBy(xpath ="//a[.=\"Attendance\"]")
		private WebElement Attendance;
		
		@FindBy(xpath ="//a[@href=\"my_attendance2.php\"]")
		private WebElement MyAttendance;
		
		@FindBy(xpath ="//a[@href=\"my_attendance_history2.php\"]")
		private WebElement MyAttendanceHistory;
		
		
		@FindBy(xpath ="//a[@href=\"my_salary.php\"]")
		private WebElement MySalary;
		
		@FindBy(xpath ="//a[@href=\"my_petty_cash.php\"]")
		private WebElement MyPettyCash;
		
		
		@FindBy(xpath ="//a[.=\"Exam\"]")
		private WebElement Exam;
		
		@FindBy(xpath ="//a[@href=\"my_student_exam_marks.php\"]")
		private WebElement MyStudentExamMarks;
		
		@FindBy(xpath ="//a[@href=\"my_student_exam_marks_history.php\"]")
		private WebElement MyStudentExamMarksHistory;
		
		@FindBy(xpath ="//a[@href=\"exam_timetable2.php\"]")
		private WebElement ExamTimetable;
		
		
		
		@FindBy(xpath ="//a[.=\"Friends\"]")
		private WebElement Friends;
		
		@FindBy(xpath ="//a[@href=\"add_friends2.php\"]")
		private WebElement AddFriends;
		
		@FindBy(xpath ="//a[@href=\"my_friends2.php\"]")
		private WebElement MyFriends;
		
		
		@FindBy(xpath ="//a[.=\"Events\"]")
		private WebElement Events;
		
		@FindBy(xpath ="//a[@href=\"my_events2.php\"]")
		private WebElement MyEvents;
		
		@FindBy(xpath ="//a[@href=\"all_events2.php\"]")
		private WebElement AllEvents;
		
		@FindBy(xpath ="//a[.=\"Teacher 1fdsfhdfgdhi\"]")
		private WebElement Teacher1fdsfhdfgdhi;
		
		@FindBy(xpath ="//span[@class=\"label label-warning\"]")
		private WebElement Notification;
		
		@FindBy(xpath ="//a[@onclick=\"showFriendRequest('1','Teacher')\"]")
		private WebElement FriendRequest;
		
		@FindBy(xpath ="//i[@class=\"fa fa-envelope-o\"]")
		private WebElement Messages;
		
		@FindBy(xpath ="//a[.=\"Profile\"]")
		private WebElement Profile;
		
		@FindBy(xpath ="//a[.=\"Sign out\"]")
		private WebElement Signout;
		
		@FindBy(xpath ="//a[.=\"ILovePrograming\"]")
		private WebElement ILovePrograming;
		
		//utilization

		public WebElement getDashboard() {
			return dashboard;
		}

		public WebElement getMyprofile() {
			return myprofile;
		}

		public WebElement getMyStudent() {
			return MyStudent;
		}

		public WebElement getSubject() {
			return Subject;
		}

		public WebElement getMySubject() {
			return MySubject;
		}

		public WebElement getAllSubject() {
			return AllSubject;
		}

		public WebElement getTimetable() {
			return Timetable;
		}

		public WebElement getMyTimetable() {
			return MyTimetable;
		}

		public WebElement getAllTimetable() {
			return AllTimetable;
		}

		public WebElement getAttendance() {
			return Attendance;
		}

		public WebElement getMyAttendance() {
			return MyAttendance;
		}

		public WebElement getMyAttendanceHistory() {
			return MyAttendanceHistory;
		}

		public WebElement getMySalary() {
			return MySalary;
		}

		public WebElement getMyPettyCash() {
			return MyPettyCash;
		}

		public WebElement getExam() {
			return Exam;
		}

		public WebElement getMyStudentExamMarks() {
			return MyStudentExamMarks;
		}

		public WebElement getMyStudentExamMarksHistory() {
			return MyStudentExamMarksHistory;
		}

		public WebElement getExamTimetable() {
			return ExamTimetable;
		}

		public WebElement getFriends() {
			return Friends;
		}

		public WebElement getAddFriends() {
			return AddFriends;
		}

		public WebElement getMyFriends() {
			return MyFriends;
		}

		public WebElement getEvents() {
			return Events;
		}

		public WebElement getMyEvents() {
			return MyEvents;
		}

		public WebElement getAllEvents() {
			return AllEvents;
		}

		public WebElement getTeacher1fdsfhdfgdhi() {
			return Teacher1fdsfhdfgdhi;
		}

		public WebElement getNotification() {
			return Notification;
		}

		public WebElement getFriendRequest() {
			return FriendRequest;
		}

		public WebElement getMessages() {
			return Messages;
		}

		public WebElement getProfile() {
			return Profile;
		}

		public WebElement getSignout() {
			return Signout;
		}

		public WebElement getILovePrograming() {
			return ILovePrograming;
		}
		
		
		
		public void SignoutFromTeacherApp()
		{
			Teacher1fdsfhdfgdhi.click();
			Signout.click();
		}
		
}
