package com.tyss.Pages.loggingAsDad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//declaration
	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement dashboardLink;

	@FindBy (xpath = "//span[text()='Profile']")
	private WebElement profileLink;

	@FindBy (xpath = "//span[text()='Teacher']")
	private WebElement teacherLink;

	@FindBy (xpath = "//span[text()='Subject']")
	private WebElement subjectLink;

	@FindBy (xpath = "//span[text()='Timetable']")
	private WebElement timeTableLink;

	@FindBy (xpath = "//span[text()='Attendance']")
	private WebElement attendenceLink;

	@FindBy (xpath = "//a[@href=\"my_sons_payments.php\"]")
	private WebElement mySonsPayments;

	@FindBy (xpath = "//span[text()='Exam']")
	private WebElement examsLink;

	@FindBy (xpath ="(//a[@class='dropdown-toggle'])[1]")
	private WebElement notificationLink;

	@FindBy (xpath = "(//a[@class='dropdown-toggle'])[2]")
	private WebElement friendRequestLink;

	@FindBy (xpath = "(//a[@class='dropdown-toggle'])[3]")
	private WebElement messagesLink;

	@FindBy (xpath = "(//a[@class='dropdown-toggle'])[4]")
	private WebElement dadsImageLink;

	@FindBy (xpath = "//a[@class='sidebar-toggle']")
	private WebElement sideBarButton;


	//utilization
	public WebElement getDashboardLink() {
		return dashboardLink;
	}

	public WebElement getProfileLink() {
		return profileLink;
	}

	public WebElement getTeacherLink() {
		return teacherLink;
	}

	public WebElement getSubjectLink() {
		return subjectLink;
	}

	public WebElement getTimeTableLink() {
		return timeTableLink;
	}

	public WebElement getAttendenceLink() {
		return attendenceLink;
	}

	public WebElement getMySonsPayments() {
		return mySonsPayments;
	}

	public WebElement getExamsLink() {
		return examsLink;
	}

	public WebElement getNotificationLink() {
		return notificationLink;
	}

	public WebElement getFriendRequestLink() {
		return friendRequestLink;
	}

	public WebElement getMessagesLink() {
		return messagesLink;
	}

	public WebElement getDadsImageLink() {
		return dadsImageLink;
	}

	public WebElement getSideBarButton() {
		return sideBarButton;
	}
}

