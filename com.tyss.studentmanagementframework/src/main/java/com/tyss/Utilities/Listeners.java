package com.tyss.Utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners  implements ITestListener
{

	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {

	}

	public void onTestFailure(ITestResult result) 
	{
		String testname = result.getMethod().getMethodName();
		System.out.println("<.............I am listening...................>");

		TakesScreenshot screenshot = (TakesScreenshot)BaseClass.sdriver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		LocalDateTime localdatetime = LocalDateTime.now();
		String datettime = localdatetime.toString().replace("  ", "_").replace(":","_");
		File dst = new File("screenshots/"+""+testname+" "+datettime+".PNG");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("problem in saving screenshot"+e.getMessage());
		}
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}





}
