package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage  {
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//declaration
	@FindBy (xpath="//span[text()='Dashboard']")
	private WebElement dashBoardlink;
	
	@FindBy (xpath ="//span[text()='My Profile']")
	private WebElement myProfileLink;

	@FindBy (xpath = "//span[text()='Classroom']")
	private WebElement classroomLink;
	
    @FindBy (xpath = "//span[text()='Grade']")
    private WebElement gradeLink;
    
    @FindBy (xpath ="//span[text()='Subject']")
    private WebElement subjectLink;
    
    @FindBy (xpath = "//span[text()='Teacher']")
    private WebElement teacherLink;
    
   
	@FindBy (xpath="//a[text()=' Add Teacher']")
    private WebElement addTeacherLink;
	
	@FindBy(xpath="//a[contains(.,' All Teacher')]")
	private WebElement addAllTeacherLnk;
    
    public WebElement getAddAllTeacherLnk() {
		return addAllTeacherLnk;
	}

	public WebElement getIngeniousDeveloperLink() {
		return ingeniousDeveloperLink;
	}

	@FindBy (xpath = "//span[text()='Subject Routing']")
    private WebElement subjectRoutingLink;
    
    @FindBy (xpath = "//span[text()='Timetable']")
    private WebElement timeTableLink;
    
    @FindBy (xpath = "//span[text()='Student']")
    private WebElement studentLink;
    
    @FindBy (xpath = "//span[text()='Student Payment']")
    private WebElement studentPaymentLink;
    
    @FindBy (xpath = "//span[text()='Attendance']")
    private WebElement attendenceLink;
    
    @FindBy (xpath = "//span[text()='Exam']")
    private WebElement examsLink;
    
    @FindBy (xpath = "//span[text()='Petty Cash']")
    private WebElement pettyCashLink;
    
    @FindBy (xpath = "//span[text()='Friends']")
    private WebElement friendsLink;
    
    @FindBy (xpath = "//span[text()='Event']")
    private WebElement eventLink;

    @FindBy (xpath = "(//a[@class='dropdown-toggle'])[1]")
    private WebElement notificationLink;
    
    @FindBy (xpath = "//a[@class='dropdown-toggle'])[2]")
    private WebElement friendRequestLink;
    
    @FindBy (xpath = "//a[@class='dropdown-toggle'])[3]")
    private WebElement messagesLink;
    
    @FindBy (xpath = "//a[@class='dropdown-toggle'])[4]")
    private WebElement ingeniousDeveloperLink;
    
    @FindBy (xpath = "//a[@role='button']")
    private WebElement sideBarToggleButton;
    
    
    
    //utilization
	public WebElement getDashBoardlink() {
		return dashBoardlink;
	}

	public WebElement getMyProfileLink() {
		return myProfileLink;
	}

	public WebElement getClassroomLink() {
		return classroomLink;
	}

	public WebElement getGradeLink() {
		return gradeLink;
	}

	public WebElement getSubjectLink() {
		return subjectLink;
	}

	public WebElement getTeacherLink() {
		return teacherLink;
	}
	
	public WebElement getAddTeacherLink() {
			return addTeacherLink;
		}

	public WebElement getSubjectRoutingLink() {
		return subjectRoutingLink;
	}

	public WebElement getTimeTableLink() {
		return timeTableLink;
	}

	public WebElement getStudentLink() {
		return studentLink;
	}

	public WebElement getStudentPaymentLink() {
		return studentPaymentLink;
	}

	public WebElement getAttendenceLink() {
		return attendenceLink;
	}

	public WebElement getExamsLink() {
		return examsLink;
	}

	public WebElement getPettyCashLink() {
		return pettyCashLink;
	}

	public WebElement getFriendsLink() {
		return friendsLink;
	}

	public WebElement getEventLink() {
		return eventLink;
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
	
	public WebElement getIngeniousDeveloper() {
		return ingeniousDeveloperLink;
	}
	
	public WebElement getSideBarToggleButton() {
		return sideBarToggleButton;
	}
	
	
}


