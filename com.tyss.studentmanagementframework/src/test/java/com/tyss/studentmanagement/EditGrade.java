package com.tyss.studentmanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tyss.Pages.AdminLoginPage;
import com.tyss.Pages.GradePage;
import com.tyss.Pages.HomePage;
import com.tyss.Pages.SubjectRoutingPage;
import com.tyss.Utilities.ExcelUtility;
import com.tyss.Utilities.FileUtility;
import com.tyss.Utilities.JavaUtility;
import com.tyss.Utilities.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditGrade {

	public static void main(String[] args) {
		JavaUtility jLib=new JavaUtility();
		ExcelUtility eLib=new ExcelUtility();
		FileUtility fLib=new FileUtility();
		WebDriverUtility wLib=new WebDriverUtility();
		String URL = fLib.getPropertKeyValue("url");
		String USERNAME = fLib.getPropertKeyValue("username");
		String PASSWORD = fLib.getPropertKeyValue("password");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		wLib.waitTillPageLoad(driver);
		AdminLoginPage loginPage=new AdminLoginPage(driver);
		HomePage homePage=new HomePage(driver);
		GradePage gradePage=new GradePage(driver);
		wLib.maximizeTheBrowser(driver);
		driver.get(URL);
		loginPage.LogInToAdmin(USERNAME, PASSWORD);
		homePage.getGradeLink().click();
	}

}
