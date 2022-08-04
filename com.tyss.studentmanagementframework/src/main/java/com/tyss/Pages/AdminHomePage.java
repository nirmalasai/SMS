package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage 
{
	//initialization

	public AdminHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//declaration

	@FindBy(xpath ="//a[.=\"Dashboard\"]")
	private WebElement dashboard;

	@FindBy(xpath ="//a[.=\"My Profile\"]")
	private WebElement myprofile;

	@FindBy(xpath ="//a[.=\"Classroom\"]")
	private WebElement Classroom;

	@FindBy(xpath ="//a[.=\"Grade\"]")
	private WebElement Grade;

	@FindBy(xpath ="//a[.=\"Subject\"]")
	private WebElement Subject;



	@FindBy(xpath ="//a[.=\"Teacher\"]")
	private WebElement Teacher;

	@FindBy(xpath ="//a[@href=\"teacher.php\"]")
	private WebElement AddTeacher;

	@FindBy(xpath ="//a[@href=\"all_teacher.php\"]")
	private WebElement AllTeacher;



	@FindBy(xpath ="//a[.=\"Subject Routing\"]")
	private WebElement SubjectRouting;

	@FindBy(xpath ="//a[.=\"Timetable\"]")
	private WebElement Timetable;



	@FindBy(xpath ="//a[.=\"Student\"]")
	private WebElement Student;

	@FindBy(xpath ="//a[@href=\"student.php\"]")
	private WebElement AddStudent;

	@FindBy(xpath ="//a[@href=\"all_student.php\"]")
	private WebElement AllStudent;

	@FindBy(xpath ="//a[@href=\"student_leave.php\"]")
	private WebElement LeaveStudent;



	@FindBy(xpath ="//a[.=\"Student Payment\"]")
	private WebElement StudentPayment;



	@FindBy(xpath ="//a[.=\"Attendance\"]")
	private WebElement Attendance;

	@FindBy(xpath ="//a[@href=\"add_attendance.php\"]")
	private WebElement AddAttendance;

	@FindBy(xpath ="//a[@href=\"student_attendance_history.php\"]")
	private WebElement StudentAttendanceHistory;

	@FindBy(xpath ="//a[@href=\"teacher_attendance_history.php\"]")
	private WebElement TeacherAttendanceHistory;



	@FindBy(xpath ="//a[.=\"Exam\"]")
	private WebElement Exam;

	@FindBy(xpath ="//a[@href=\"exam.php\"]")
	private WebElement CreateExam;

	@FindBy(xpath ="//a[@href=\"exam_timetable.php\"]")
	private WebElement ExamTimetable;

	@FindBy(xpath ="//a[@href=\"student_exam_marks.php\"]")
	private WebElement StudentExamMarks;

	@FindBy(xpath ="//a[@href=\"student_exam_marks_history.php\"]")
	private WebElement StudentExamMarkHistory;


	@FindBy(xpath ="//a[.=\"Petty Cash\"]")
	private WebElement PettyCash;


	@FindBy(xpath ="//a[.=\"Friends\"]")
	private WebElement Friends;

	@FindBy(xpath ="//a[@href=\"add_friends.php\"]")
	private WebElement AddFriends;

	@FindBy(xpath ="//a[@href=\"my_friends.php\"]")
	private WebElement MyFriends;



	@FindBy(xpath ="//a[.=\"Event\"]")
	private WebElement Event;

	@FindBy(xpath ="//a[@href=\"my_events.php\"]")
	private WebElement MyEvent;

	@FindBy(xpath ="//a[@href=\"all_events.php\"]")
	private WebElement AllEvent;
	
	
	
	@FindBy(xpath ="//a[.=\"Ingenious Developer1\"]")
	private WebElement IngeniousDeveloper1;
	
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

	public WebElement getStudentAttendanceHistory() {
		return StudentAttendanceHistory;
	}

	

	public WebElement getIngeniousDeveloper1() {
		return IngeniousDeveloper1;
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

	public WebElement getDashboard() {
		return dashboard;
	}

	public WebElement getMyprofile() {
		return myprofile;
	}

	public WebElement getClassroom() {
		return Classroom;
	}

	public WebElement getGrade() {
		return Grade;
	}

	public WebElement getSubject() {
		return Subject;
	}

	public WebElement getTeacher() {
		return Teacher;
	}

	public WebElement getAddTeacher() {
		return AddTeacher;
	}

	public WebElement getAllTeacher() {
		return AllTeacher;
	}

	public WebElement getSubjectRouting() {
		return SubjectRouting;
	}

	public WebElement getTimetable() {
		return Timetable;
	}

	public WebElement getStudent() {
		return Student;
	}

	public WebElement getAddStudent() {
		return AddStudent;
	}

	public WebElement getAllStudent() {
		return AllStudent;
	}

	public WebElement getLeaveStudent() {
		return LeaveStudent;
	}

	public WebElement getStudentPayment() {
		return StudentPayment;
	}

	public WebElement getAttendance() {
		return Attendance;
	}

	public WebElement getAddAttendance() {
		return AddAttendance;
	}

	

	public WebElement getTeacherAttendanceHistory() {
		return TeacherAttendanceHistory;
	}

	public WebElement getExam() {
		return Exam;
	}

	public WebElement getCreateExam() {
		return CreateExam;
	}

	public WebElement getExamTimetable() {
		return ExamTimetable;
	}

	public WebElement getStudentExamMarks() {
		return StudentExamMarks;
	}

	public WebElement getStudentExamMarkHistory() {
		return StudentExamMarkHistory;
	}

	public WebElement getPettyCash() {
		return PettyCash;
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

	public WebElement getEvent() {
		return Event;
	}

	public WebElement getMyEvent() {
		return MyEvent;
	}

	public WebElement getAllEvent() {
		return AllEvent;
	}
	
	
	
	public void SignoutFromAdminApp()
	{
		IngeniousDeveloper1.click();
		Signout.click();
	}


}
