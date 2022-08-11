package com.tyss.studentmanagement;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.tyss.Pages.AdminLoginPage;
import com.tyss.Pages.HomePage;
import com.tyss.Pages.LoginPage;
import com.tyss.Pages.SubjectRoutingPage;
import com.tyss.Utilities.BaseClass;
import com.tyss.Utilities.ExcelUtility;
import com.tyss.Utilities.FileUtility;
import com.tyss.Utilities.JavaUtility;
import com.tyss.Utilities.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateSubjectRoutingTest extends BaseClass {
@Test
	public void main() throws InterruptedException {
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
		LoginPage loginPage=new LoginPage(driver);
		HomePage homePage=new HomePage(driver);
		SubjectRoutingPage page=new SubjectRoutingPage(driver);
//		wLib.maximizeTheBrowser(driver);
//		driver.get(URL);
//		loginPage.LogInToAdmin(USERNAME, PASSWORD);
		homePage.getSubjectRoutingLink().click();
		page.getAddBtn().click();
		page.grade(wLib, 2);
		page.teacher(wLib, 2);
		page.subject(wLib, 2);
		page.teacher(wLib, 2);
		page.fee("12345");
		page.submit();
//		wLib.waitTillElementToClick(driver, homePage.getIngeniousDeveloper());
		
		Thread.sleep(50000);
		System.out.println("done");
		
		
	
		
	}

}
