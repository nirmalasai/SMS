package com.tyss.Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.tyss.Pages.AdminHomePage;
import com.tyss.Pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver sdriver;
	public WebDriver driver;
	public DataBaseUtility dbUtilities =new DataBaseUtility();
	public ExcelUtility excelUtilities=new ExcelUtility();
	public FileUtility fileUtilities=new FileUtility();
	public WebDriverUtility wdUtilities=new WebDriverUtility();
	public JavaUtility javaUtilities=new JavaUtility();
	
	
	@BeforeSuite(groups= {"regressionTest","smokeTest"})
	public void dbConfig()
	{
		dbUtilities.connectToDB();
	}
	@BeforeClass(groups= {"regressionTest","smokeTest"})
	//to lauch the browser
	public void lauchTheBrowser()throws IOException
	{
		String BROWSER=fileUtilities.getPropertKeyValue("browser");
		System.out.println(BROWSER);
		String URL=fileUtilities.getPropertKeyValue("url");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=WebDriverManager.chromedriver().create();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=WebDriverManager.firefoxdriver().create();
		}
		else
		{
			WebDriverManager.firefoxdriver().create();
		}
		System.out.println("Browser launched");
		
		
		//Enter the Url into the apllication
		driver.get(URL);
		
		//maximize the screen
		wdUtilities.maximizeTheBrowser(driver);
		
		wdUtilities.waitTillPageLoad(driver);
		
	}
	
	@BeforeMethod(groups= {"regressionTest","smokeTest"})
	public void loginToApp() throws IOException
	{
		String USERNAME=fileUtilities.getPropertKeyValue("username");
		String PASSWORD=fileUtilities.getPropertKeyValue("password");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.loginToAppli(USERNAME, PASSWORD);
		
		System.out.println("Login Sucessful");
	}
	@AfterMethod(groups= {"regressionTest","smokeTest"})
	public void logoutFromApp()
	{
		AdminHomePage homepage=new AdminHomePage(driver);
		homepage.SignoutFromAdminApp();
		System.out.println("Logout Successful");
	}
	@AfterClass(groups= {"regressionTest","smokeTest"})
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("Browser sucessfully closed");
	}
	@AfterSuite(groups= {"regressionTest","smokeTest"})
	public void closeDBConn()
	{
		dbUtilities.closeDB();
	}

	

}
