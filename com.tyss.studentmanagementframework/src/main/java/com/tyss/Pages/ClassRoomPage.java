package com.tyss.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassRoomPage {
	//Declaration
@FindBy(id="name")private WebElement classRoomName;
@FindBy(id="student_count")private WebElement studentCount;
@FindBy(id="btnSubmit")private WebElement submitbtn;
@FindBy(xpath="//input[@type='search']")private WebElement searchBox;
@FindBy(xpath="//a[.='Edit']")private WebElement editClassRoom;
@FindBy(id="name1")private WebElement updateClassRoomName;
@FindBy(id="student_count1")private WebElement updateStudentCount;
@FindBy(id="btnSubmit1")private WebElement updatebtn;
//initialization
public ClassRoomPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//utilization

public WebElement getClassRoomName() {
	return classRoomName;
}
public WebElement getSearchBox() {
	return searchBox;
}

public WebElement getUpdatebtn() {
	return updatebtn;
}

public WebElement getEditClassRoom() {
	return editClassRoom;
}

public WebElement getUpdateClassRoomName() {
	return updateClassRoomName;
}

public WebElement getUpdateStudentCount() {
	return updateStudentCount;
}

public void setStudentCount(WebElement studentCount) {
	this.studentCount = studentCount;
}

public WebElement getStudentCount() {
	return studentCount;
}
public WebElement getSubmitbtn() {
	return submitbtn;
}
public void classRoom(String classname,String noOfStudent) {
	classRoomName.sendKeys(classname);
	studentCount.sendKeys(noOfStudent);
	submitbtn.click();
}
public void editAndUpdateClassRoom(String classRoomName,String newClassName, String newStudentCount) {
	searchBox.sendKeys(classRoomName);
	editClassRoom.click();
	updateClassRoomName.sendKeys(newClassName);
	updateStudentCount.sendKeys(newStudentCount);
	updatebtn.click();
}

}
