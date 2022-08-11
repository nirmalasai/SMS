package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParentHomePage
{
	//initialization

	public ParentHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//declaration

	@FindBy(xpath ="//span[.=\"Dashboard\"]")
	private WebElement dashboard;

	@FindBy(xpath ="//span[.=\"My Profile\"]")
	private WebElement myprofile;

	@FindBy(xpath ="//a[@href=\"parents_profile.php\"]")
	private WebElement ParentProfile;

	@FindBy(xpath ="//a[@href=\"my_sons_profile.php\"]")
	private WebElement MySonProfile;



	@FindBy(xpath ="//span[.=\"Teacher\"]")
	private WebElement Teacher;

	@FindBy(xpath ="//a[@href=\"my_sons_teacher.php\"]")
	private WebElement MySonTeacher;

	@FindBy(xpath ="//a[@href=\"all_teacher3.php\"]")
	private WebElement AllTeacher;


	@FindBy(xpath ="//span[.=\"Subject\"]")
	private WebElement Subject;

	@FindBy(xpath ="//a[@href=\"my_sons_subject.php\"]")
	private WebElement MySonsProject;

	@FindBy(xpath ="//a[@href=\"all_subject3.php\"]")
	private WebElement AllProjects;


	@FindBy(xpath ="//span[.=\"Timetable\"]")
	private WebElement Timetable;

	@FindBy(xpath ="//a[@href=\"my_sons_timetable.php\"]")
	private WebElement MySonsTimetable;

	@FindBy(xpath ="//a[@href=\"all_timetable3.php\"]")
	private WebElement AllTimetable;



	@FindBy(xpath ="//span[.=\"Attendance\"]")
	private WebElement Attendance;

	@FindBy(xpath ="//a[@href=\"my_sons_attendance.php\"]")
	private WebElement MySonsAttendance;

	@FindBy(xpath ="//a[@href=\"my_sons_attendance_history.php\"]")
	private WebElement MySonsAttendanceHistory;


	@FindBy(xpath ="//span[.=\"My Son's Payments\"]")
	private WebElement MySonsPayments;


	@FindBy(xpath ="//span[.=\"Exam\"]")
	private WebElement Exam;

	@FindBy(xpath ="//a[@href=\"my_sons_exam_marks.php\"]")
	private WebElement MySonsExamMarks;

	@FindBy(xpath ="//a[@href=\"my_sons_exam_marks_history.php\"]")
	private WebElement MySonsExamMarksHistory;

	@FindBy(xpath ="//a[@href=\"my_sons_exam_timetable.php\"]")
	private WebElement MySonsExamTimetable;



	@FindBy(xpath ="//span[@class=\"label label-warning\"]")
	private WebElement Notification;

	@FindBy(xpath ="//a[@onclick=\"showFriendRequest('1','Teacher')\"]")
	private WebElement FriendRequest;

	@FindBy(xpath ="//i[@class=\"fa fa-envelope-o\"]")
	private WebElement Messages;


	@FindBy(xpath ="//span[.=\"Dad 1\"]")
	private WebElement Dad1;

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

	public WebElement getParentProfile() {
		return ParentProfile;
	}

	public WebElement getMySonProfile() {
		return MySonProfile;
	}

	public WebElement getTeacher() {
		return Teacher;
	}

	public WebElement getMySonTeacher() {
		return MySonTeacher;
	}

	public WebElement getAllTeacher() {
		return AllTeacher;
	}

	public WebElement getSubject() {
		return Subject;
	}

	public WebElement getMySonsProject() {
		return MySonsProject;
	}

	public WebElement getAllProjects() {
		return AllProjects;
	}

	public WebElement getTimetable() {
		return Timetable;
	}

	public WebElement getMySonsTimetable() {
		return MySonsTimetable;
	}

	public WebElement getAllTimetable() {
		return AllTimetable;
	}

	public WebElement getAttendance() {
		return Attendance;
	}

	public WebElement getMySonsAttendance() {
		return MySonsAttendance;
	}

	public WebElement getMySonsAttendanceHistory() {
		return MySonsAttendanceHistory;
	}

	public WebElement getMySonsPayments() {
		return MySonsPayments;
	}

	public WebElement getExam() {
		return Exam;
	}

	public WebElement getMySonsExamMarks() {
		return MySonsExamMarks;
	}

	public WebElement getMySonsExamMarksHistory() {
		return MySonsExamMarksHistory;
	}

	public WebElement getMySonsExamTimetable() {
		return MySonsExamTimetable;
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

	public WebElement getDad1() {
		return Dad1;
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

	public void SignoutFromParentApp()
	{
		Dad1.click();
		Signout.click();
	}

	public void mysonsmark()
	{
		Exam.click();
		MySonsExamMarks.click();
	}
	public void clickonallsubject()
	{
		Subject.click();
		AllProjects.click();

	}


}
