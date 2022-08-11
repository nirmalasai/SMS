package com.tyss.studentmanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.tyss.Pages.AdminLoginPage;
import com.tyss.Pages.HomePage;
import com.tyss.Pages.SubjectRoutingPage;
import com.tyss.Utilities.BaseClass;
import com.tyss.Utilities.ExcelUtility;
import com.tyss.Utilities.FileUtility;
import com.tyss.Utilities.JavaUtility;
import com.tyss.Utilities.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditSubjectRoutingTest extends BaseClass {
@Test
	public void main()   {
//		JavaUtility jLib=new JavaUtility();
//		ExcelUtility eLib=new ExcelUtility();
//		FileUtility fLib=new FileUtility();
//		WebDriverUtility wLib=new WebDriverUtility();
//		String URL = fLib.getPropertKeyValue("url");
//		String USERNAME = fLib.getPropertKeyValue("username");
//		String PASSWORD = fLib.getPropertKeyValue("password");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		wLib.waitTillPageLoad(driver);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		AdminLoginPage loginPage=new AdminLoginPage(driver);
		HomePage homePage=new HomePage(driver);
		SubjectRoutingPage page=new SubjectRoutingPage(driver);
//		wLib.maximizeTheBrowser(driver);
//		driver.get(URL);
//		loginPage.LogInToAdmin(USERNAME, PASSWORD);
		homePage.getSubjectRoutingLink().click();
		page.edit();
		page.editGrade(wLib, 4);
		page.update();

	}

}
